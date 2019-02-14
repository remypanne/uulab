package com.Cultureguide.uulab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class OAuth2ServerConfiguration {

	private static final String RESOURCE_ID = "api";
	
	@Configuration
	@EnableResourceServer
	protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	
	@Override 
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID);
	}
	
	@Override	
	public void configure(HttpSecurity http) throws Exception {
		http
		.requestMatcher(new AntPathRequestMatcher("/api/**"))
		.authorizeRequests().anyRequest().hasAnyRole("USER")
		.and()
		.csrf().disable()			
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	}
	@Configuration
	@EnableAuthorizationServer
	protected static class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
		private TokenStore tokenStore = new InMemoryTokenStore();

		@Autowired
		@Qualifier("authenticationManagerBean")
		private AuthenticationManager authenticationManager;

		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
			clients.
				inMemory()
				.withClient("formation_public")
				.authorizedGrantTypes("password", "refresh_token")
				.authorities("USER")
				.scopes("read", "write")
				.resourceIds(RESOURCE_ID)
				.secret("formation_secret");
		}

		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
			endpoints.tokenStore(tokenStore).authenticationManager(authenticationManager);
		}

		@Bean
		@Primary
		public DefaultTokenServices tokenServices() {
			DefaultTokenServices tokenServices = new DefaultTokenServices();
			tokenServices.setSupportRefreshToken(true);
			tokenServices.setTokenStore(this.tokenStore);
			return tokenServices;
			}

		}
	}


