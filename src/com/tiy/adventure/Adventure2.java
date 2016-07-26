package com.tiy.adventure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//used an array instead

public class Adventure2
{
	private String[]  storyLine = new String[12];
	private String[] choices = new String[12];

	String begStoryLine;
	
	private static Scanner sc = new Scanner(System.in); 

	public Adventure2()
	{
		storyLine[0] = "Three friends were at a lake what activities did they want to do?(Chose the number (1,2,3))";
		storyLine[1] = "So now they are running through the woods and there is a fort. Should they?";
		storyLine[2] = "There is someone inside you all become friends.";
		storyLine[3] = "Someone yells back go away so you run away.";
		storyLine[4] = "You just murdered someone you're now in jail. Sucks to suck";
		storyLine[5] = "You are now in the middle of the lake and see a big snapping turtle. What do you do?(Choose the number)";
		storyLine[6] = "You safely get out of the water and everyone is ok.";
		storyLine[7] = "The turtle bites the stick in half and you swim as fast as you can.";
		storyLine[8] = "You now are missing a finger. Sucks to suck.";
		storyLine[9] = "You come accross a dog in the middle of the road that looks crazy. What do you do? (Choose a number)";
		storyLine[10] = "You have problems go see a therapist.";
		storyLine[11] = "Your very nice. You also now have rabbies. Sucks to suck.";
		storyLine[12] = "You have a cold heart, but good move.";
		
		choices[0] = "Run";
		choices[1] = "Swim";
		choices[2] = "Drive Away";
		choices[3] = "Go Into it";
		choices[4] = "Yell Hello";
		choices[5] = "Knock it down";
		choices[6] = "Swim Away";
		choices[7] = "Poke it with a stick";
		choices[8] = "Try to pick it up";
		choices[9] = "Hit the dog";
		choices[10] = "Try to get out and help";
		choices[11] = "Drive around the dog slowly";
	
		
	}
	
	public void storyLine()
	{
		boolean stopStory = true;
		
		while(stopStory)
		{
			
			System.out.println(storyLine[0]);
			System.out.println(choices[0]);
			System.out.println(choices[1]);
			System.out.println(choices[2]);
			System.out.println();
			
			String firstChoice = sc.nextLine();
			
			
			switch (firstChoice)
			{
			case "1":
				firstStoryLine();
				break;				
			
			case "2":
				secondStoryLine();
				break;
				
			case "3":
				thirdStoryLine();
				break;
			}
			
		System.out.println("Do you want to have another adventure?(Type no to exit the Adventure; Type anything else to do another one.1)");
		String fchoice = sc.nextLine();
		
		stopStory = !fchoice.equals("no");
		}
	}
	
	public void firstStoryLineText()
	{
		
	
		
		
		//type out first story line
	}
	public void firstStoryLine()
	{
		System.out.println(storyLine[1]);
		
		
		System.out.println(choices[3]);
		System.out.println(choices[4]);
		System.out.println(choices[5]);
		
		String choice1_2 = sc.nextLine();
		
		switch (choice1_2)
		{
		
		case "1":
			System.out.println(storyLine[2]);
			break;
		
		case "2":
			System.out.println(storyLine[3]);
			break;
			
		case "3":
			System.out.println(storyLine[4]);
			break;
			
		}
		
		
	}
	
	
	public void secondStoryLineText()
	{
		
		

	}
	public void secondStoryLine()
	{
		System.out.println(storyLine[5]);
		
		
		
		System.out.println(choices[6]);
		System.out.println(choices[7]);
		System.out.println(choices[8]);
		
		String choice2_2 = sc.nextLine();
		
		switch (choice2_2)
		{
		
		case "1":
			System.out.println(storyLine[6]);
			break;
		
		case "2":
			System.out.println(storyLine[7]);
			break;
			
		case "3":
			System.out.println(storyLine[8]);
			break;
		}
	}
	
	
	public void thirdStoryLineText()
	{
		
	
		
	
	}
	public void thirdStoryLine()
	{
		System.out.println(storyLine[9]);
		
		
		
		System.out.println(choices[9]);
		System.out.println(choices[10]);
		System.out.println(choices[11]);
		
		
		String choice3_2 = sc.nextLine();
		
		switch (choice3_2)
		{
		
		case "1":
			System.out.println(storyLine[9]);
			break;
		
		case "2":
			System.out.println(storyLine[10]);
			break;
			
		case "3":
			System.out.println(storyLine[11]);
			break;
		}
	}
	
//	public void textFile()
//	{
////		begStoryLine = new String(Files.readAllBytes(C:\Users\admin\workspace\7_26_2016Adventure\adventuretxt.get("begstoryline.txt")));
//		
////		Scanner in = new Scanner(new File("C:\Users\admin\workspace\7_26_2016Adventure\adventuretxt\begstoryline.text"));
////		
////		while(in.hasNext())
////		{
////			String line = in.nextLine();
////		}
//		
//		try
//		{
//			FileReader reader = new FileReader("begstoryline.txt");
//			int character;
//			
//			while ((character = reader.read()) != -1)
//					{
//						System.out.print((char) character);
//					}
//					reader.close();
//		} 
//		
//		catch (FileNotFoundException e)
//		{
//			// TODO Auto-gene  rated catch block
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args)
	{
		Adventure2 adv = new Adventure2();
		adv.storyLine();
		
//		adv.textFile();
		
		

	}

}
