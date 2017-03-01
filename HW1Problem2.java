//Andrew LaRoche Team 9 CSI402
//Homework1 Problem 2

package edu.albany.HW1Problem2;
import java.lang.Math;

public class HW1Problem2 
{
//A method to take in two integers and check if the second is a multiple of the first
	static public boolean Multiple(int multIn1, int multIn2 )
	{
		
		if (multIn1 % multIn2 == 0)
		{
			return true;
		}
		else
			return false;
	
	}
	//A method to take user input and find a remainder using modulus
	static public int Remainder(int inRem)
	{
	
	return inRem % 7;
	}
	//a method to read in 4 seperate inputs and using math.hypot (square root of two squares)
	//to calculate the distance
	static public double Distance(double x1,double y1, double x2,double y2)
	{
		
	return Math.hypot(x2 - x1,y2 - y1);
	}
	
}
