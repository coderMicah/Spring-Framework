package com.micah.demoMavem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

//    	xml based annotation
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle obj = (Vehicle) context.getBean("vehicle");
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle obj = (Vehicle) context.getBean("bike");
//    	obj.drive();
    	
    	Tyre tyre1 = (Tyre)context.getBean("tyre");
    	System.out.print(tyre1);
    	
    
    }
}
