package com.revature.dogs;

public class Pug extends Dogs implements Flatface {

	public static int pugCounter = 0;
	
	public Pug(boolean swim, String breed, int age, String name, String color) {

		super(false, breed, age, name, color);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed, int age, String name) {
		
		super(false, breed, age, name);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed, int age) {
		super(false, breed, age);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed) {
		super(false, breed);
		pugCounter++;
	}
	
	public Pug(boolean swim) {
		this(swim, "Pug");
	}
	
	public Pug() {
		this(true);
	}
	
	public void flatFace() {
		System.out.println(this.getName() + "is flat faced!");
	}
	
	
}
