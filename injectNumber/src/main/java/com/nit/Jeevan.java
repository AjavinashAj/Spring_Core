package com.nit;

public class Jeevan {
	private Medicine img;

	
	public Jeevan() {
		System.out.println("o-para::constructor");
	}


	public Jeevan(Medicine img) {
		super();
		this.img = img;
	}


	@Override
	public String toString() {
		return "Jeevan [img=" + img + "]";
	}
	

}
