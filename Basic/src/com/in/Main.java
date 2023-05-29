package com.in;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.in.ApplicationContext;
//import com.in.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Resource r=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		 Engine e= (Engine)factory.getBean("engine");
		 Keys k=new Keys();
		 k.run(e);
		 
		 
		 
	}

}
