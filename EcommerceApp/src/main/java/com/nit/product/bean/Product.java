package com.nit.product.bean;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String pId="A111";
	private String PName="milk";
	private String pCname="amul";
	private double pPrice=29.50;
	private int pQty=4;
	
	public Product() {
		System.out.println("Product::Constructor");
	}
	public Product(String pId, String pName, String pCname, double pPrice,int pQty) {
		super();
		this.pId = pId;
		PName = pName;
		this.pCname = pCname;
		this.pPrice = pPrice;
		this.pQty=pQty;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public String getpCname() {
		return pCname;
	}
	public void setpCname(String pCname) {
		this.pCname = pCname;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", PName=" + PName + ", pCname=" + pCname + ", pPrice=" + pPrice + ", pQty="
				+ pQty + "]";
	}
	
}
