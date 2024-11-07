package com.jtc.MVC;
// Hello Guys I am Ankur Testing Purpose
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.jtc.MVC"})
public class JTCwebconfig {
	public JTCwebconfig() {
		System.out.println("JTCwebconfig Constructor");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("viewresolver.....");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
//show.jsp
