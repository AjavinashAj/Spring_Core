package com.nit.Student;

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
        System.out.println( "Hello World!" );
        //method-1 :manually object create and insertion
        /*
        Sudent ob=new Sudent();
        System.out.println(ob.toString());
        ob.setId(11);
        ob.setName("Avinash");
        ob.setAddr("Delhi");
        System.out.println(ob.toString());
        */
        //method -2 :automatic object creation by using configuration file ,configuration file use for object creation and value insert
        //configuration file ke shath IOC container bhi use karna parta hai
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/config/config.xml");
        Sudent ob=(Sudent)context.getBean("stu");
        System.out.println(ob.toString());
    }
    
       
}
