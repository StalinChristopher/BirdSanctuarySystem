package com.yml.birdsanctuary;

public class MainApplication {

	public static void main(String[] args) {
		Parrot parrot= new Parrot();
		parrot.id = "p001";
		Duck duck = new Duck();
		duck.id = "d001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "o001";
		Penguin penguin = new Penguin();
		penguin.id = "pn001";
		
		BirdSanctuaryRepository birdSanctuaryRepository = new BirdSanctuaryRepository();
		birdSanctuaryRepository.add(parrot);
		birdSanctuaryRepository.add(duck);
		birdSanctuaryRepository.add(ostrich);
		birdSanctuaryRepository.add(penguin);
		birdSanctuaryRepository.print();
	}

}
