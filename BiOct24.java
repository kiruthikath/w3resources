/*
 24. Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 
 */

//Package Declared
package basic_part1;

//Import the Package
import java.util.Scanner;

//Main class
public class BiOct24 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner bioct = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the binary input: ");
		String binaryNum = bioct.nextLine();
		
		//Convert binary number into decimal number
		int deciNum = Integer.parseInt(binaryNum, 2);
		
		//Convert decimal Number into Octal number
		String octNum = Integer.toOctalString(deciNum);
		
		//print the output
		System.out.println("The Octal representation of " + binaryNum + " number is: " + octNum);
		

	}

}
