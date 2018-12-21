package co.com.ud.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfiguration {
	
	@Bean(name="modelMapperBean")
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
}
