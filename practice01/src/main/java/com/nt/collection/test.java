package com.nt.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/collection/collectionconfig.xml");
		
		Emp Emp1=(Emp)context.getBean("Emp1");
		System.out.println(Emp1.getName());
		System.out.println(Emp1.getPhones());
		System.out.println(Emp1.getAddress());
		System.out.println(Emp1.getCourse());
		System.out.println(Emp1.getProps());
	}

}
