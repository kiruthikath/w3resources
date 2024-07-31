/*
 20. Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F 
 */

//Package Declared
package basic_part1;

//Package imported
import java.util.Scanner;

//main class
public class IntHex20 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner inhex = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the integer input: ");
		int input = inhex.nextInt();
		
		//Convert the integer input into the hexadecimal
		String hexNum = Integer.toHexString(input);
		
		//Print the output
		System.out.println("The Hexadecimal representation of " + input + " number is: " + hexNum);

	}

}
