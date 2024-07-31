/*
 21. Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17  
 */

//Package Declared
package basic_part1;

//Import Package
import java.util.Scanner;

//Main class
public class IntOct21 {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner inoc = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the input: ");
		int input = inoc.nextInt();
		
		//Convert the integer input into octal number
		String octNum = Integer.toOctalString(input);
		
		//Print the output
		System.out.println("The Octal Representation of " + input + " number is: " + octNum);
		

	}

}
