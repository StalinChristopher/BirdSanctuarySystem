package com.yml.birdsanctuary;
import java.util.Scanner;

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
		final int EXIT_VALUE=7;
		Scanner scanner = new Scanner(System.in);
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		
		while(option!=EXIT_VALUE) {
			System.out.println("Enter your options");
			System.out.printf("\n1. Add a bird\n2. Remove the bird \n3. Print the birds\n4. Print Swimmable\n5. Print Flyable\n6. Print Eatable \n%d. Exit\n ",EXIT_VALUE);
			option = scanner.nextInt();
			
			switch(option) {
				case 1: 
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
					break;
				case 2: 
					System.out.println("Enter the name of the bird to be removed");
					scanner.nextLine();
					String birdName = scanner.nextLine();
					Bird removeBird = birdSanctuaryRepository.getBird(birdName);
					birdSanctuaryRepository.removeBird(removeBird);
					break;
				case 3: 
					ViewLayer viewLayer = new ViewLayer();
					viewLayer.print();
					//birdSanctuaryRepository.print();
					break;
				case 4:
					viewLayer = new ViewLayer();
					viewLayer.printFlyable();
					break;					
				case 5:
					viewLayer = new ViewLayer();
					viewLayer.printSwimmable();
					break;
				case 6:
					viewLayer = new ViewLayer();
					viewLayer.printEatable();
					break;
				case 7:
					break;
					
			}
		}
	}
}
