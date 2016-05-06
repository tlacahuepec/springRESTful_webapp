package org.rest.spring.root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ImportResource({ "classpath*:/rest_config.xml" })
@ComponentScan(basePackages = "org.rest.spring")
@PropertySource({ "classpath:rest.properties", "classpath:web.properties" })
public class AppProperties {

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
