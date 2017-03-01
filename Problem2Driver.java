//Andrew LaRoche Team 9 CSI402
//Homework 1 Problem 2 Driver

package edu.albany.HW1Problem2;
import java.util.Scanner;

//A class that takes the methods from HW1Problem2 and utilizes the
//user input and passes them into those methods then prints out the results.
public class Problem2Driver 
{
	
	public static void main(String[] args)
	{
	
	
	Scanner console = new Scanner(System.in);
	
	
	//prompting user and accepting inputs from keyboard
	System.out.println("Please enter the first integer to find multiple");
	int multIn1 = console.nextInt();
	
	System.out.println("Please enter the second integer to find multiple");
	int multIn2 = console.nextInt();
	
	System.out.println("Please enter a number to be divided with 7 for remainder" );
	int inRem = console.nextInt();
	
	System.out.println("Please enter your x1 coordinate");
	double x1 = console.nextDouble();
	System.out.println("Please enter your y1 coordinate");
	double y1 = console.nextDouble();
	System.out.println("Please enter your x2 coordinate");
	double x2 = console.nextDouble();
	System.out.println("Please enter your y2 coordinate");
	double y2 = console.nextDouble();
	//end user prompts and accepted inputs
	
	
	//printlines with results
	System.out.println("The multiple of" + " " + multIn1 + " " + "and" + " " + multIn2 + " " + "is:" + " " + HW1Problem2.Multiple(multIn1,multIn2) );
	System.out.println("The remainder of" + " " + inRem + " " + "divided by 7 is:" + " " + HW1Problem2.Remainder(inRem) );
	System.out.printf("The distance between" + " " + x1 +","+ y1 + " " + "and" + " " + x2+"," +y2 + " " + "is:" + " " + "%.2f",HW1Problem2.Distance(x1,y1,x2,y2) );
	}

} //end of program
