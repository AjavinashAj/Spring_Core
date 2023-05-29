package com.nit.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<String> phnoes;
	private Set<String> addresses;
	private Map<String, String> courses;
	public Student() {
		System.out.println("0-para::constructor");
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
	public List<String> getPhnoes() {
		return phnoes;
	}
	public void setPhnoes(List<String> phnoes) {
		this.phnoes = phnoes;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student(int id, String name, List<String> phnoes, Set<String> addresses, Map<String, String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.phnoes = phnoes;
		this.addresses = addresses;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phnoes=" + phnoes + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
	
	

}
