package com.nit.StudentCollection1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //method -1 creating object manually
        /*
        Student ob=new Student();
        ob.setId(12);
        ob.setName("Avinash");
        List<String> li=ob.setPhnoes();
        li.add(null);
        System.out.println(ob.toString());
        */
        ApplicationContext context =new ClassPathXmlApplicationContext("com/nit/config/config.xml");
        Student ob=(Student)context.getBean("stu");
        System.out.println(ob.toString());
        
    }
    
    
    
}
