package com.revature.dogs;

public class DogsDriver {

	public static void main(String[] args) {
		
		System.out.println(new Pug(false, "Zeke", "Fawn", "Pug"));
		
		System.out.println(new GoldenRetriever(true, "Buddy", "Gold", "Golden Retriever"));
		
		System.out.println(new Pug());
		
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
