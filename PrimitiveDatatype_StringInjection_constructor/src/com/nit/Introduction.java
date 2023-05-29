package com.nit;

public class Introduction {
	private int id;
	private String name;
	private String collageName;
	private String matricPercentage;
	private float InterPercentage;
	private double graduationPercentage;
	public Introduction(int id, String name, String collageName, String matricPercentage, float interPercentage,
			double graduationPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.collageName = collageName;
		this.matricPercentage = matricPercentage;
		InterPercentage = interPercentage;
		this.graduationPercentage = graduationPercentage;
		
	}
	@Override
	public String toString() {
		return "Introduction [id=" + id + ", name=" + name + ", collageName=" + collageName + ", matricPercentage="
				+ matricPercentage + ", InterPercentage=" + InterPercentage + ", graduationPercentage="
				+ graduationPercentage + "]";
	}
	public void dis()
	{
		System.out.println(id+" "+name+" "+collageName+" "+" "+matricPercentage+" "+InterPercentage+" "+graduationPercentage);
	}
	

}
