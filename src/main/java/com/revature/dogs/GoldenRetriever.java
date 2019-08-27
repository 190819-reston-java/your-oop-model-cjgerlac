package com.revature.dogs;

public class GoldenRetriever extends Dogs {

	public static int goldCounter = 0;
	
	public GoldenRetriever(boolean swim, String name, String color, String breed) {
	
		super(true, name, color, breed);
		goldCounter++;
}
	public GoldenRetriever(boolean swim, String name, String color) {
		
		super(true, name, color);
		goldCounter++;
	}
	
	public GoldenRetriever(boolean swim, String name) {
		
		super(true, name);
		goldCounter++;
	}
	
	public GoldenRetriever(boolean swim) {
		
		super(true);
		goldCounter++;
	}
	
	public GoldenRetriever() {
		
		this(true);
	}
}