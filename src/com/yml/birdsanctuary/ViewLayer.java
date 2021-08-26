package com.yml.birdsanctuary;

public class ViewLayer {
	BirdSanctuaryRepository birdSanctuaryRepositroy = BirdSanctuaryRepository.getInstance();
	public void print() {
		for(Bird item: birdSanctuaryRepositroy.getAllBirds()) {
			System.out.println(item);
		}
	}
	
	public void printFlyable() {
		for(Bird item: birdSanctuaryRepositroy.getAllBirds()) {
			if(item.canFly) {
//				((Flyable)item).fly();    alternate for the below code
				item.fly();
			}
			
		}
	}
	
	public void printSwimmable() {
		for(Bird item: birdSanctuaryRepositroy.getAllBirds()) {
			if(item.canSwim) {
//				((Flyable)item).fly();    alternate for the below code
				item.swim();
			}
		}
	}
	
	public void printEatable() {
		for(Bird item: birdSanctuaryRepositroy.getAllBirds()) {
			item.eat();
		}
	}
	
}
