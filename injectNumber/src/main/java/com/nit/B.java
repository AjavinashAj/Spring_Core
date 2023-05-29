package com.nit;

public class B {
	private String name;
	
	public B() {
		System.out.println("0-para const::b");
	}

	public B(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}

	

}
