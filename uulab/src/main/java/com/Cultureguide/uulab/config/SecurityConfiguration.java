package com.Cultureguide.uulab.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.Cultureguide.uulab.persistence.entity.User;
import com.Cultureguide.uulab.service.IUserService;


@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private IUserService userService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {    
		
		auth.authenticationProvider(new AuthenticationProvider() {
			
			@Override
			public Authentication authenticate(Authentication auth) throws AuthenticationException {

				final String userName = auth.getName();
				final String password = auth.getCredentials().toString();

				User u = userService.findByMailAndPassword(userName, password);				
				if (u != null) {
					List<GrantedAuthority> grantedAuths = new ArrayList<>();
					grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
					return new UsernamePasswordAuthenticationToken(u, "", grantedAuths);		
				}
	
				return null;				
			}

			@Override
			public boolean supports(Class<?> arg0) {
				return true;
			}});
	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}


	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
			.antMatchers("/api/public/**")
			.antMatchers("/index.html");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()		
		.anyRequest()		
		.permitAll();
	}

}
