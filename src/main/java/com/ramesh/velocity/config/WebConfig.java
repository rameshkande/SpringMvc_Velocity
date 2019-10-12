package com.ramesh.velocity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfig;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"com.ramesh.velocity"})
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver viewResolver() {
		VelocityLayoutViewResolver viewResolver = new VelocityLayoutViewResolver();
		viewResolver.setCache(true);
		viewResolver.setPrefix("/WEB-INF/layout/");
		viewResolver.setLayoutUrl("/WEB-INF/layout/layout.vm");
		viewResolver.setSuffix(".vm");
		return viewResolver;
	}
	
	@Bean 
	public VelocityConfig velocityConfig() {
		VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
		velocityConfigurer.setResourceLoaderPath("/");
		return velocityConfigurer;
	}
}
