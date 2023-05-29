package com.nit.beans;

public class DTDC implements Courier{

	public DTDC() {
		super();
		System.out.println("DTDC:)-parameter constructor");
	}

	public final String deliver(int orderid) {
		
		return "DTDC is ready to deliver products of"+orderid;
	}
	

}
