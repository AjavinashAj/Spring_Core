package com.nit;

public class Answer {
	private int id;
	private String ans;
	private String by;
	public Answer(int id, String ans, String by) {
		super();
		this.id = id;
		this.ans = ans;
		this.by = by;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + by + ", Answer=" + ans + "]";
	}
	

}
