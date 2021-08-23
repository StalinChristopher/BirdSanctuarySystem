package com.yml.birdsanctuary;

import java.util.*;

public class BirdSanctuaryRepository {
	
	private List<Object> birdList = new ArrayList<Object>();
	
	public void  add(Bird bird) {
		birdList.add(bird);
	}
	
	public void print() {
		for(Object item: birdList) {
			System.out.println(item);
		}
	}
}
