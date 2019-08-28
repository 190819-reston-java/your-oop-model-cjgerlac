package com.revature.dogs;

public class GoldenRetriever extends Dogs {

	public static int goldCounter = 0;
	
	public GoldenRetriever(boolean swim, String breed, String name, String color) {
	
		super(true, breed, name, color);
		goldCounter++;
}
	public GoldenRetriever(boolean swim, String breed, String name) {
		
		super(true, breed, name);
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