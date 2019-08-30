package com.revature.dogs;

public class Pug extends Dogs implements Flatface {

	public static int pugCounter = 0;
	
	public Pug(boolean swim, String breed, int age, String name, String color) {

		super(swim, breed, age, name, color);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed, int age, String name) {
		
		super(swim, breed, age, name);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed, int age) {
		super(swim, breed, age);
		pugCounter++;
	}
	
	public Pug(boolean swim, String breed) {
		super(swim, breed);
		pugCounter++;
	}
	
	public Pug(boolean swim) {
		this(swim, "Pug");
	}
	
	public Pug() {
		this(false);
	}
	
	public void flatFace() {
		System.out.println(this.getName() + "is flat faced!");
	}
	
	
}
