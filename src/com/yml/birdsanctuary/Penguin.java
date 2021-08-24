package com.yml.birdsanctuary;

public class Penguin extends Bird{
	
	Penguin(){
		color = Color.BLACK_WHITE;
		name = "Penguin";
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		System.out.println(name+ " can swim");
		
	}

	@Override
	public void eat() {
		System.out.println(name + " can eat");
		
	}
}
