package com.nit;

public class A {
	private int x;

	

	public A() {
		System.out.println("0-para::const of A");
	}
	public void setX(int x) {
		this.x = x;
	}
	public void show()
	{
		System.out.println("inject value:"+x);
	}

}
