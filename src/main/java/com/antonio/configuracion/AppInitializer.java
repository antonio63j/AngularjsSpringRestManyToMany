package com.antonio.configuracion;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Cualquier clase que extiende AbstractAnnotationConfigDispatcherServletInitializer, lo utilizará
// spring para configurar el DistpacherServlet.

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[] { AppConfiguration.class };
    	return null;
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return null;
        return new Class[] { AppConfiguration.class };
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
/*    @Override
    protected Filter[] getServletFilters() {
    	Filter [] singleton = { new CORSFilter() };
    	return singleton;
	}*/
 
}