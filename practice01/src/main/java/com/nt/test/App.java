package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/test/config.xml");
    	Student stu =(Student)context.getBean("stu");
    	System.out.println(stu);
    }
}
