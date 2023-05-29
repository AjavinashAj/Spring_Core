package com.nit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		ClassPathResource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Question q=(Question)factory.getBean("que");
		q.display();
	}

}
