package com.nit.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.product.bean.Product;
import com.nit.service.Order;




public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(com.nit.cfg.AppConfig.class);
		Order service=context.getBean(Order.class);
		//System.out.println(service.toString());
		service.display();
		
		/*
		ArrayList<Product> li=new ArrayList<Product>();
		li.add(new Product("A111","milk","amul",29.50,4));
		li.add(new Product("A222","paneer","amul",65,4));
		li.add(new Product("A333","Ghee","Anandha",400,2));
		li.add(new Product("A444","milk","Anadha",30,10));
		li.add(new Product("A555","lasi","amul",15,16));
		li.add(new Product("A666","milk","shudha",29,9));
		Stream<Product>sm=li.stream();
		sm.forEach((y)->System.out.println(y));
*/
		ArrayList <Order>li1=new ArrayList<Order>();
		li1.add(new Order("o01", "A12","12-jan-23"));
		li1.add(new Order("o02", "A13","12-jan-23"));
		li1.add(new Order("o03", "A124","12-jan-23"));
		li1.add(new Order("o04", "A125","12-jan-23"));
		li1.add(new Order("o05", "A129","12-jan-23"));
		Stream<Order>sm1=li1.stream();
		sm1.forEach((y)->System.out.println(y));
		
		
	}

}
