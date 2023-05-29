package com.nit.run;

public class Car implements Engine{
String key;

@Override
public void start(String key) {
	this.key=key;
	System.out.println("Car");
}

}
