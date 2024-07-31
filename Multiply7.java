/*
 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */


//Package Declared
package basic_part1;

//Importing Package
import java.util.Scanner;

//Main class
public class Multiply7 {

	//Main method
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//Scanner class
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the input: ");
			int input = sc.nextInt();
			//Iterating over 10
			for(int i = 0; i<=10; i++) {
				//Printing the output
				System.out.println(input + " x " + i + " = " + (input*i));
			}
		}
		
		
		

	}

}
