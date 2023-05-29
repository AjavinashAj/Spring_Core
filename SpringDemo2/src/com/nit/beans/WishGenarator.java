package com.nit.beans;
import java.util.*;
import java.util.Date;
public class WishGenarator {
	private String name;
	private Date date;
	public WishGenarator() {
		super();
		System.out.println("WishGenerator :0-parameter constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void Display()
	{
		System.out.println("Good Morning:"+name+" "+date);
	}
	

}
