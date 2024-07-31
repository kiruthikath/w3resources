/*
 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */



//Package declared
package basic_part1;

import java.util.Scanner;

//Main class
public class AMSDR6 {

	//Main method
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//Scanner class
		Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in)) {
			//Read  input
			System.out.println("Enter the first input: ");
			int num1 = sc1.nextInt();
			System.out.println("Enter the second input: ");
			int num2 = sc2.nextInt();
			
			//Printing the input
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
		}
		
		

	}

}
