package com.revature.dogs;

public class Pug extends Dogs implements Flatface {

	public static int pugCounter = 0;
	
	public Pug(boolean swim, String name, String color, String breed) {

		super(false, name, color, breed);
		pugCounter++;
	}
	
	public Pug(boolean swim, String name, String color) {
		
		super(false, name, color);
		pugCounter++;
	}
	
	public Pug(boolean swim, String name) {
		super(false, name);
		pugCounter++;
	}
	
	public Pug(boolean swim) {
		super(false);
		pugCounter++;
	}
	
	public Pug() {
		this(false);
	}
	
	public void flatFace() {
		System.out.println("This little puggo has a flat face!");
	}
}
