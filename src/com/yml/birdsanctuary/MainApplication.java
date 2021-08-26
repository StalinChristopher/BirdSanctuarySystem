package com.yml.birdsanctuary;
import java.util.Scanner;

import com.yml.birdsanctuary.Bird.Color;

import java.util.*;

public class MainApplication {
	

	public static void main(String[] args) {
		MainApplication mainApplication = new MainApplication();
		mainApplication.showUserMenu();
	/*	Parrot parrot= new Parrot();
		parrot.id = "p001";
		Duck duck = new Duck();
		duck.id = "d001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "o001";
		Penguin penguin = new Penguin();
		penguin.id = "pn001";
		Penguin penguin2 = new Penguin();
		penguin2.id = "pn002";
		
		BirdSanctuaryRepository birdSanctuaryRepository = new BirdSanctuaryRepository();
		
		birdSanctuaryRepository.add(parrot);
		birdSanctuaryRepository.add(duck);
		birdSanctuaryRepository.add(ostrich);
		birdSanctuaryRepository.add(penguin);
		birdSanctuaryRepository.add(penguin2);
		
		birdSanctuaryRepository.print();
		
		birdSanctuaryRepository.removeBird(duck);
		
		System.out.println();
		
		birdSanctuaryRepository.print();
	*/
		
	}
	
	void showUserMenu() {
		int option=0;
		final int EXIT_VALUE=8;
		Scanner scanner = new Scanner(System.in);
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		
		while(option!=EXIT_VALUE) {
			System.out.println("Enter your options");
			System.out.printf("\n1. Add a bird\n2. Remove the bird \n3. Print the birds\n4. Print Swimmable"
					+ "\n5. Print Flyable\n6. Print Eatable\n7. Edit bird \n%d. Exit\n ",EXIT_VALUE);
			option = scanner.nextInt();
			ViewLayer viewLayer = new ViewLayer();
			switch(option) {
				case 1: 
					/*
					Parrot parrot= new Parrot();
					parrot.id = "p001";
					Duck duck = new Duck();
					duck.id = "d001";
					Ostrich ostrich = new Ostrich();
					ostrich.id = "o001";
					Penguin penguin = new Penguin();
					penguin.id = "pn001";
					Penguin penguin2 = new Penguin();
					penguin2.id = "pn002";
				
					birdSanctuaryRepository.add(parrot);
					birdSanctuaryRepository.add(duck);
					birdSanctuaryRepository.add(ostrich);
					birdSanctuaryRepository.add(penguin);
					birdSanctuaryRepository.add(penguin2);
					*/
					addTemporaryBirds();
					Bird bird  = new Bird();
					System.out.println("Enter the id");
					scanner.nextLine();
					String id = scanner.nextLine();
					
					bird.id = id;
					System.out.println("Enter the name");
					String name = scanner.nextLine();
					;
					bird.name = name;
					System.out.println("choose the color");

					int count = 1;
					for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
						System.out.println("  " + count + ". " + color);
						count++;
					}
					int choice = scanner.nextInt();

					int count1 = 1;
					for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
						if (choice == count1) {
							bird.color = color;
							break;
						}
						count1++;
					}
					System.out.println("Can the bird fly (true/false)?");
					Boolean isFly = scanner.nextBoolean();
					bird.canFly = isFly;
					System.out.println("Can the bird swim (true/false)");
					Boolean isSwim = scanner.nextBoolean();
					bird.canSwim = isSwim;
					birdSanctuaryRepository.add(bird);
					break;
				case 2: 
					System.out.println("Enter the name of the bird to be removed");
					scanner.nextLine();
					String birdName = scanner.nextLine();
					Bird removeBird = birdSanctuaryRepository.getBird(birdName);
					if(removeBird == null) {
						System.out.println("Bird doesnot exist");
						break;
					}
					birdSanctuaryRepository.removeBird(removeBird);
					break;
				case 3: 
					viewLayer.print();
					//birdSanctuaryRepository.print();
					break;
				case 4:
					viewLayer.printFlyable();
					break;					
				case 5:
					viewLayer.printSwimmable();
					break;
				case 6:
					viewLayer.printEatable();
					break;
				case 7:
					editBird();
					break;
				case 8:
					break;
					
			}
		}
	}
	
	private void addTemporaryBirds() {
		Bird duck = new Bird();
		duck.name = "Duck";
		duck.id = "d001";
		duck.color = Color.WHITE;
		duck.canFly = true;
		duck.canSwim = true;
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		birdSanctuaryRepository.add(duck);
		
		Bird penguin = new Bird();
		penguin.name = "Penguin";
		penguin.id = "pn001";
		penguin.color = Color.BLACK_WHITE;
		penguin.canFly = false;
		penguin.canSwim = true;
		birdSanctuaryRepository.add(penguin);
	}

	private void editBird() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the bird to edit");
		String birdNameTemp = scanner.nextLine();
		Bird bird = BirdSanctuaryRepository.getInstance().getBird(birdNameTemp);
		while (true) {
			System.out.println("\n1. Edit bird name\n2. Edit ID\n3. Edit color\n4. Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the new name");
				scanner.nextLine();
				String newName = scanner.nextLine();
				bird.name = newName;
				break;
			case 2:
				System.out.println("Enter the new id");
				String newId = scanner.nextLine();
				bird.id = newId;
				break;
			case 3:
				System.out.println("Enter the new color");
				System.out.println("choose the color");

				int count = 1;
				for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
					System.out.println("  " + count + ". " + color);
					count++;
				}
				int choice = scanner.nextInt();

				int count1 = 1;
				for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
					if (choice == count1) {
						bird.color = color;
						break;
					}
					count1++;
				}
				
				break;
			case 4: 
				return;
			}
		}
		
	}
	
}
