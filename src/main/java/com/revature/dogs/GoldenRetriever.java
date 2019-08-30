package com.revature.dogs;

public class GoldenRetriever extends Dogs {

	public static int goldCounter = 0;
	
	public GoldenRetriever(boolean swim, String breed, int age, String name, String color) {
	
		super(true, breed, age, name, color);
		goldCounter++;
}
	public GoldenRetriever(boolean swim, String breed, int age, String name) {
		
		super(true, breed, age, name);
		goldCounter++;
	}
	
	public GoldenRetriever(boolean swim, String breed, int age) {
		
		super(true, breed, age);
		goldCounter++;
	}
	
	public GoldenRetriever(boolean swim, String breed) {
		
		super(true, breed);
		goldCounter++;
	}
	
	public GoldenRetriever(boolean swim) {
		
		this(true, "Golden Retriever");
	}
	
	public GoldenRetriever() {
		this(true);
	}
}