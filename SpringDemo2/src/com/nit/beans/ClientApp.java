package com.nit.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientApp {

	public static void main(String[] args) {
		//locate spring bean configuration file
		FileSystemResource rs=new FileSystemResource("src/com/nit/cfgs/applicationcontext.xml");
		//Activate BeanFactory container
		XmlBeanFactory factory=new XmlBeanFactory(rs);
		//generate Bean class object
		//WishGenarator bean=(WishGenarator)factory.getBean("wsg");
		WishGenarator bean=factory.getBean("wsg",WishGenarator.class);
		//call bussiness method
		bean.Display();
	}

}
