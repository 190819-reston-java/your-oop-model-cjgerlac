package com.revature.dogs;

public class DogsDriver {

	public static void main(String[] args) {
		
		System.out.println(new Pug(false, "Pug", "Zeke", "fawn"));
		
		System.out.println(new GoldenRetriever(true, "Golden Retriever", "Buddy", "gold"));
		
		System.out.println(new GoldenRetriever());
		
		System.out.println(new Pug());
		
		System.out.println(new Pug(true, "Pug", "Marshall", "black"));
		
		if (Pug.pugCounter < 2) {
			System.out.println(Pug.pugCounter + " wittle puggie and counting!");
		} else {
			System.out.println(Pug.pugCounter + " wittle puggies and counting!");
		}
		
		if (GoldenRetriever.goldCounter < 2) {
			System.out.println(GoldenRetriever.goldCounter + " good boy goldie!");
		} else {
			System.out.println(GoldenRetriever.goldCounter + " good boyo goldies!");
		}
	}
}
