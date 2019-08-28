package com.revature.dogs;

public class Pug extends Dogs implements Flatface {

	public static int pugCounter = 0;
	
	public Pug(boolean swim, String breed, String name, String color) {

		super(false, breed, name, color);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed, String name) {
		
		super(false, breed, name);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed) {
		super(false, breed);
		pugCounter++;
	}
	
	public Pug(boolean swim) {
		this(false, "Pug");
	}
	
	public Pug() {
		this(false);
	}
	
	public void flatFace() {
		System.out.println("This little puggo has a flat face!");
	}
}
