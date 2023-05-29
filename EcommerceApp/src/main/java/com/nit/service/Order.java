package com.nit.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.product.bean.Product;

@Component
public class Order {
	@Autowired
	List<Product> product;
	String orderId;
	String UserId;
	String orderCreatedDate;

	public Order() {
		
		System.out.println("Order:constructor");
	}
	

	


	public Order(String orderId, String userId, String orderCreatedDate) {
		super();
		this.orderId = orderId;
		UserId = userId;
		this.orderCreatedDate = orderCreatedDate;
	}





	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", UserId=" + UserId + ", orderCreatedDate=" + orderCreatedDate + "]";
	}










	public Order(List<Product> product) {
		super();
		this.product = product;
	}



	public void display()
	{
		System.out.println(product);
	}






	

}
