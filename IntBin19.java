/*
 19. Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 
 */

//Package Declared
package basic_part1;

import java.util.Scanner;

//Main class
public class IntBin19 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner ib = new Scanner(System.in);
		//Read the integer input
		System.out.println("Enter the integer input: ");
		int input = ib.nextInt();
		
		//Convert the integer number 
		String binarynum = Integer.toBinaryString(input);
		
		//Print the output
		System.out.println("The Binary Representation of " + input + " number is: " + binarynum);
		
	
	}

}
