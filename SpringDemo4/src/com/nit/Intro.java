package com.nit;

public class Intro {
	private String name;
	private String desig;
	private String orgName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public String Display() {
		return "Intro [name=" + name + ", desig=" + desig + ", orgName=" + orgName + "]";
	}
	public void det()
	{
		System.out.println(name+" "+desig+" "+orgName);
	}

}
