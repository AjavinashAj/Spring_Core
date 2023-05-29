package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//A ob=context.getBean(A.class);
		//ob.show();
		//B ob1=context.getBean(B.class);
		//System.out.println(ob1.toString());
		Jeevan ob=context.getBean(Jeevan.class);
		System.out.println(ob.toString());

	}

}
