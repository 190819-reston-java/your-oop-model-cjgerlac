package com.revature.dogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class DogsDriver {

	public static void main(String[] args) {
		
		createArrayList();
		
	//	System.out.println(new Pug(false, "Pug", 7, "Zeke", "fawn"));
		
//		System.out.println(new GoldenRetriever(true, "Golden Retriever", 4, "Buddy", "gold"));
	
	//	System.out.println(new GoldenRetriever());
		
	//	System.out.println(new Pug());
		
	//	System.out.println(new Pug(true, "Pug", 0, "Marshall", "black"));
		
		if (Pug.pugCounter < 2) {
			System.out.println(Pug.pugCounter + " wittle puggie and counting!");
		} else {
			System.out.println(Pug.pugCounter + " wittle puggies and counting!");
		}
		
		if (GoldenRetriever.goldCounter < 2) {
			System.out.println(GoldenRetriever.goldCounter + " good boy goldie!");
		} else {
			System.out.println(GoldenRetriever.goldCounter + " good boy goldies!");
		}
	}

	private static void createArrayList() {
		
		List<Dogs> dogList = new ArrayList<Dogs>();
		try {
			dogList.add(new Pug(false, "Pug", 1/0, "Zeke", "fawn"));
		} catch (Exception e) {
			System.out.println("Invalid age entry. Ignoring case.");
		}
		dogList.add(new GoldenRetriever(true, "Golden Retriever", 6, "Buddy", "gold"));
		dogList.add(new GoldenRetriever());
		dogList.add(new Pug());
		dogList.add(new Pug(true, "Pug", 12, "Marshall", "black"));
		dogList.add(new Pug(true, "Pug", -17, "Dede", "fawn"));

		SortedSet<Dogs> sortedDogSet = new TreeSet<Dogs>(dogList);
		System.out.println(sortedDogSet);
	}
}
