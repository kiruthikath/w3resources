/*
 18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110 
 */


//Package Declared
package basic_part1;

//Import packaged
import java.util.Scanner;

//Main class
public class BinaruProd18 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner biprod = new Scanner(System.in);
		//Read and store binary number as a string
		System.out.print("Enter the first binary number: ");
		String binary1 = biprod.nextLine();

		System.out.print("Enter the second binary number: ");
		String binary2 = biprod.nextLine();

		// Convert binary strings to integers
		int num1 = Integer.parseInt(binary1, 2);
		int num2 = Integer.parseInt(binary2, 2);

		// Product the two numbers
		int prod = num1 * num2;

		// Convert the sum back to a binary string
		String binaryProd = Integer.toBinaryString(prod);

		//Print the output
		System.out.println("Product of two binary numbers are: " + binaryProd);

	}

}
