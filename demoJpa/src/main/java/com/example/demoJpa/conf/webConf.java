package com.example.demoJpa.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.example.demoJpa" })
public class webConf implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		return bean;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
//		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/META-INF/js/");
//		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/META-INF/img/");
		registry.addResourceHandler("/webfonts/**").addResourceLocations("classpath:/static/webfonts/");
	}
}
