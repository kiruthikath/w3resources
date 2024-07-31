/*
 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

//Package Declared
package basic_part1;
//Importing package
import java.util.Scanner;

//Main class
public class Product5 {

	//Main method
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//Declare scanner class
		Scanner n1 = new Scanner(System.in);
				Scanner n2 = new Scanner(System.in)) {
			//Getting input
			System.out.println("Enter the first input: ");
			int num1 = n1.nextInt();
			System.out.println("Enter the second input: ");
			int num2 = n2.nextInt();
			
			//Printing the statement
			System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
		}
		
		
		

	}

}
