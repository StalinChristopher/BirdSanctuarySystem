package com.yml.birdsanctuary;

public class Ostrich extends Bird {
	
	Ostrich(){
		color = Color.GREY;
		name = "Ostrich";
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println(name + " can eat");
		
	}
}
