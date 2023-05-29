package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
	Employee e=ac.getBean("employee",Employee.class);
	Department dep=ac.getBean("departement",Department.class);
	Organization org =ac.getBean("organization",Organization.class);
	e.Display();
	
	}

}
