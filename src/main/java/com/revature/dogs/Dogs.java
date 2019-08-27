package com.revature.dogs;

public abstract class Dogs {

	private String name;
	private String color;
	private String breed;
	private boolean swim;
	
	public Dogs(boolean swim, String name, String color, String breed) {
		
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.swim = swim;
	}
	
	public Dogs(boolean swim, String name, String color) {
		
		this(swim, name, color, "NA");
	}
	
	public Dogs(boolean swim, String name) {
		
		this(swim, name, "NA", "NA");
	}
	
	public Dogs(boolean swim) {
		
		this(swim, "Fido", "NA", "NA");
	}
	
	public Dogs() {
		this(true, "Fido", "NA", "NA");
	}
	
	public void goodBoy() {
		System.out.println(this.name + " is a good boy!");
	}
	
	public void wet() {
		System.out.println(this.name + " is all wet!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}
	
}
