package com.nit;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Name {
	private int id;
	private String name;
	private String course;
	private Set prodetails;
	public Name(int id, String name, String course, Set prodetails) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.prodetails = prodetails;
	}
    public void details()
    {
    	Iterator itr=prodetails.iterator();
    	while(itr.hasNext())
    	{
    		
    	}
    }
}
