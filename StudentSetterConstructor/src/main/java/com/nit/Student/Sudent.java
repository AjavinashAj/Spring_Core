package com.nit.Student;

public class Sudent {
	private int id;
	private String name;
	private String addr;
	public Sudent() {
		System.out.println("0-para::constructor of student bean class");
	}
	public Sudent(int id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Sudent [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
