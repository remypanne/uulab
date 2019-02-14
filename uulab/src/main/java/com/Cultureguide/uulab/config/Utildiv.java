package com.Cultureguide.uulab.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Utildiv {

		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
}
