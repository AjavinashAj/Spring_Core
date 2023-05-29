package com.nit.vehicle;
import com.nit.Drivingforce.DEngine;
import com.nit.Drivingforce.PEngine;
public class Car implements DEngine,PEngine{

	@Override
	public void Pstart() {
		System.out.println("Petrol Engine Start");
		
	}

	@Override
	public void Dstart() {
		System.out.println("Diesel Engine Start");
		
	}

	
	

	
}
