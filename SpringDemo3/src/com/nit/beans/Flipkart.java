package com.nit.beans;
import java.util.Random;
public class Flipkart {
private Courier courier;

public Flipkart() {
	super();
	System.out.println("Flipkart :0-parameter constructor");
}
public void setCourier(Courier courier) {
	this.courier = courier;
}
public String purchase(String item[])
{
	//generate order id
	Random rad=new Random();
	int orderid=rad.nextInt(70000);
	//deliver order
	String status=courier.deliver(orderid);
	return status +"Bill Amt for orderid"+"is 7000";
	
}

}
