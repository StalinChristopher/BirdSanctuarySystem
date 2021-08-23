package com.yml.birdsanctuary;

abstract public class Bird {
	
	String id;
	String color;
	
	@Override
	public String toString() {
		return "Bird [id=" + id + ", color=" + color + "]";
	}
	
}
