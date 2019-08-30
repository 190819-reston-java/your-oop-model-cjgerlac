package com.revature.dogs;

public abstract class Dogs implements Comparable<Dogs>{

	private String name;
	private String color;
	private int age;
	private String breed;
	private boolean swim;
	
	public Dogs(boolean swim, String breed, int age, String name, String color) {
		
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.swim = swim;
		try {
			if(age > 0) {
				this.age = age;
			}
		} catch (Exception e) {
			this.age = 0;
		}
	}
	
	public Dogs(boolean swim, String breed, int age, String name) {
		
		this(swim, breed, age, name, "NA");
	}
	
	public Dogs(boolean swim, String breed, int age) {
		
		this(swim, breed, age, "Fido", "NA");
	}
	
	public Dogs(boolean swim, String breed) {
		
		this(swim, breed, 2, "Fido", "NA");
	}
	
	public Dogs(boolean swim) {
		this(true, "NA", 2, "Fido", "NA");
	}
	
	public Dogs() {
		this(true, "NA", 2, "Fido", "NA");
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

	@Override
	public String toString() {
		return '\n' + "Dog: name = " + this.name + ", breed = " + this.breed + ", age = " + this.age + ", color = " + this.color + ", swimmer = " + this.swim;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Dogs o) {
		if(this.getAge() > o.getAge()) {
			return -1;
		}
		else if(this.getAge() < o.getAge()) {
			return 1;
		}
		else {
			return 1;
		}
	}
}
