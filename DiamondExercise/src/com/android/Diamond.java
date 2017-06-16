package com.android;
/**
 * Assignment on 18-11-2016
 * @author murph
 *
 */

public class Diamond {
	
	//the method takes an int. The int passed in is the user number inputted.
	static void makeDiamond(int userInput){ //this is the number for the user input. The diamond shape will only work for odd numbers
		
		 
		
		 //The number of iterations for the top half of the diamond. I use i+=2 to increment by 2 each time it loops so no odd Numbers are used in the lines of *s.
		 for (int i = 1; i < userInput; i += 2){
			 //A Loop for the amount of spaces needed on each line.
		        for (int j = 0; j < userInput - 1 - i / 2; j++) //The calculation can have i/2 and not be a problem as it is integer division.
		        {
		           System.out.print(" ");//write a space for each time in the loop. 
		        }
		        
		     //A Loop for the amount of asterisks on each line.   
		        for (int j = 0; j < i; j++) //the number of asterisks in a line will always be same as i. as it starts at 0 and goes until it reaches i.
		        {
		            System.out.print("*");//write an asterisk (NOT A NEW LINE)
		        }

		        System.out.println(""); //after printing the number of asterisks for the line, skip to the next line.
		    }
		 //This loops all the way down to whatever number the user has inputed to we have a triangle with a base length of userInput number of asterisks.

		    // Same logic apply here but backward as it is bottom of diamond
		    for (int i = userInput; i > 0; i -= 2){ //so start with userInput for the total number of loops and set i as that, then -2 each time down to 1. 
		    
		   //A loop for the spaces again. set j to 0... when j < (userInput-1-(i/2)), increment j by 1 
		        for (int j = 0; j < userInput -1 - i / 2; j++){ //again the i/2 is ok because ints round down. 
		    
		            System.out.print(" "); //print the space for each time it loops (on same line)
		        }

		        for (int j = 0; j < i; j++){ //makes sure the number of asterisks on a line = i. (Which starts as userInput and works down to 1.
		        
		            System.out.print("*"); //print the * for each time it loops (On same line)
		        } //This code is the EXACT same as the code for the *s in the first triangle loop... So it sould be replaced with a method!!!
		        
		        //After the loops for spaces and *s, but still inside the initial loop for the bottom half, we need a line separator.
		        System.out.println(); //this is a line separator and ensures each iteration of the loop for the bottom of the diamond is on a new line.
		    }
		    
		    
	}

}//end of class Diamond
