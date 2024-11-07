package com.jtc.MVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JTCWevAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("GetRootConfigClasses*****");
		//Class cls[] = {JTCwebconfig.class};
		return new Class[] {JTCwebconfig.class} ;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("****getServletConfigClasses*****");
		return new Class[] {JTCwebconfig.class} ;
	}

	@Override
	protected String[] getServletMappings() {
	System.out.println("******getServletMappings*******");
		return new String[] {"*.jtc"};
	}
	
	
	
	
}
