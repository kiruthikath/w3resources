/*
 22. Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4 
 */

//Package Declared
package basic_part1;

//Import Scanner
import java.util.Scanner;

//Main class
public class Bide22 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner bide = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the binary input: ");
		String binaryNum = bide.nextLine();
		
		//Convert the binary number into  decimal number
		int decNum = Integer.parseInt(binaryNum,2);
		
		//Print the output
		System.out.println("The decimal representation of " + binaryNum + " number is: " + decNum);
	}

}
