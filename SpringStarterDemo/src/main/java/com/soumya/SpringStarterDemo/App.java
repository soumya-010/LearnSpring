package com.soumya.SpringStarterDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringStarterDemo.xml");
    	
        // Mobile iPhone = new Mobile ();  -- Spring makes this easier
        // Mobile iPhone = (Mobile) context.getBean("mobile");
        Mobile iPhone = context.getBean("mobile", Mobile.class); // Eliminates need for Typecasting
        iPhone.display();
        Tablet iPad = context.getBean("tab", Tablet.class);
    	// Tablet Galaxy = (Tablet) context.getBean("galaxy");
        iPhone.BootUp();	
        iPad.BootUp();
        
    }
}
