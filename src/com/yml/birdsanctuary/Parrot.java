package com.yml.birdsanctuary;

public class Parrot extends Bird{
	
	Parrot(){
		color = Color.GREEN;
		name = "Parrot";
	}

	@Override
	public void fly() {
		System.out.println(name+ " can fly");
		
	}

	@Override
	public void swim() {
	}

	@Override
	public void eat() {
		System.out.println(name + " can eat");
		
	}

}
