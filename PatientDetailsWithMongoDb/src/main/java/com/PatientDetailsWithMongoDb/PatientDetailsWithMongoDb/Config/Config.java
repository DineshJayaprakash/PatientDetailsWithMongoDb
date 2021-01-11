package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * class Config
 * 
 * 
 * @author dines
 * @created date 21/12
 * @description used to create singleton bean
 *
 */
@Configuration
public class Config {
	
	/**
	 * function getModelMapper
	 * 
	 * @return sigleton bean
	 * @description used to create singleton bean for model mapper
	 */
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
