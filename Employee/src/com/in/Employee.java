package com.in;

public class Employee {
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void display()
	{
		System.out.println(id+" "+name);
	}

}
