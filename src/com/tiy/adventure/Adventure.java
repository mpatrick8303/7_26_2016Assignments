package com.tiy.adventure;

import java.util.Scanner;

//thought this would work really well turned out being more work
public class Adventure
{	
	//story 1 variables
	private String slc1_1_B;
	
	private String slc1_2_1;
	private String slc1_2_2;
	private String slc1_2_3;
	
	private String slp1_1;
	
	private String slp1_2_1;
	private String slp1_2_2;
	private String slp1_2_3;
	
	//story 2 variables
	private String slc2_1_B;
	
	private String slc2_2_1;
	private String slc2_2_2;
	private String slc2_2_3;
	
	
	private String slp2_1;
	
	private String slp2_2_1;
	private String slp2_2_2;
	private String slp2_2_3;
	
	//story 3 variables
	private String slc3_1_B;
	
	private String slc3_2_1;
	private String slc3_2_2;
	private String slc3_2_3;
	
	private String slp3_1;
	
	private String slp3_2_1;
	private String slp3_2_2;
	private String slp3_2_3;
	
	private static Scanner sc = new Scanner(System.in); 

	
	public void storyLine()
	{
		String slB = "Three friends were at a lake what activities did they want to do?(Chose the number (1,2,3))"; //beginning of story
		boolean stopStory = true;
		
		while(stopStory)
		{
			
			System.out.println(slB);
			System.out.println(slc1_1_B);
			System.out.println(slc2_1_B);
			System.out.println(slc3_1_B);
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
		
		slc1_1_B = "1 Run"; //1st choice story from B
		
		slc1_2_1 = "1 Go into it";//1st choice part 2 story 1
		slc1_2_2 = "2 Yell Hello";//2nd choice part 2 story 1
		slc1_2_3 = "3 Knock it down";//3rd choice part 2 story 1
		
		slp1_1 = "So now they are running through the woods and there is a fort. Should they?";//paragraph story 1 from  B
		
		slp1_2_1 = "There is someone inside you all become friends.";//paragraph story 1 choice 1
		slp1_2_2 = "Someone yells back go away so you run away.";//paragraph story 1 choice 2
		slp1_2_3 = "You just murdered someone you're now in jail. Sucks to suck";//paragraph story 1 choice 3
		
		
		//type out first story line
	}
	public void firstStoryLine()
	{
		System.out.println(slp1_1);
		
		
		System.out.println(slc1_2_1);
		System.out.println(slc1_2_2);
		System.out.println(slc1_2_3);
		
		String choice1_2 = sc.nextLine();
		
		switch (choice1_2)
		{
		
		case "1":
			System.out.println(slp1_2_1);
			break;
		
		case "2":
			System.out.println(slp1_2_2);
			break;
			
		case "3":
			System.out.println(slp1_2_3);
			break;
			
		}
		
		
	}
	
	
	public void secondStoryLineText()
	{
		slc2_1_B = "2 Swim"; //2nd choice story from B
		
		slc2_2_1 = "1 Swim Away";//1st choice part 2 story 2
		slc2_2_2 = "2 Try to poke it with the stick";//2nd choice part 2 story 2
		slc2_2_3 = "3 Try to pick it up";//3rd choice part 2 story 2
		
		slp2_1 = "You are now in the middle of the lake and see a big snapping turtle. What do you do?(Choose the number)";//paragraph story 2 from  B
		
		slp2_2_1 = "You safely get out of the water and everyone is ok.";//paragraph story 2 choice 1
		slp2_2_2 = "The turtle bites the stick in half and you swim as fast as you can.";//paragraph story 2 choice 2
		slp2_2_3 = "You now are missing a finger. Sucks to suck.";//paragraph story 2 choice 3
		//type out second story line and call switch 
	}
	public void secondStoryLine()
	{
		System.out.println(slp2_1);
		
		
		
		System.out.println(slc2_2_1);
		System.out.println(slc2_2_2);
		System.out.println(slc2_2_3);
		
		String choice2_2 = sc.nextLine();
		
		switch (choice2_2)
		{
		
		case "1":
			System.out.println(slp2_2_1);
			break;
		
		case "2":
			System.out.println(slp2_2_2);
			break;
			
		case "3":
			System.out.println(slp2_2_3);
			break;
		}
	}
	
	
	public void thirdStoryLineText()
	{
		
		slc3_1_B = "3 Drive Away"; //3rd choice story from B
		
		slc3_2_1 = "1 Hit the dog";//1st choice part 2 story 3
		slc3_2_2 = "2 Try to get out and help";//2nd choice part 2 story 3
		slc3_2_3 = "3 Drive around the dog slowly";//3rd choice part 2 story 3
		
		slp3_1 = "You come accross a dog in the middle of the road that looks crazy. What do you do? (Choose a number)";//paragraph story 3 from  B

		slp3_2_1 = "You have problems go see a therapist.";//2nd paragraph story 3 choice 1
		slp3_2_2 = "Your very nice. You also now have rabbies. Sucks to suck.";//2nd paragraph story 3 choice 2
		slp3_2_3 = "You have a cold heart, but good move.";//2nd paragraph story 3 choice 3
		//type out third story line
	}
	public void thirdStoryLine()
	{
		System.out.println(slp3_1);
		
		
		
		System.out.println(slc3_2_1);
		System.out.println(slc3_2_2);
		System.out.println(slc3_2_3);
		
		
		String choice3_2 = sc.nextLine();
		
		switch (choice3_2)
		{
		
		case "1":
			System.out.println(slp3_2_1);
			break;
		
		case "2":
			System.out.println(slp3_2_2);
			break;
			
		case "3":
			System.out.println(slp3_2_3);
			break;
		}
	}
	
	
	public static void main(String[] args)
	{
		Adventure adv = new Adventure();
		adv.firstStoryLineText();
		adv.secondStoryLineText();
		adv.thirdStoryLineText();
		adv.storyLine();
		

	}

}
