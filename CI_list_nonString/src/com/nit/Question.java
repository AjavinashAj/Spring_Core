package com.nit;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> answer;
	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	public void display()
	{
		System.out.println(id+" "+name);
		Iterator it=answer.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
