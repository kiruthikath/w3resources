/*/
 17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
 */


//Package Declared
package basic_part1;

import java.util.Scanner;

//Main class
public class BinaryAdd17 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner biadd = new Scanner(System.in);
		//Read and store binary number as String
		System.out.print("Enter the first binary number: ");
        String binary1 = biadd.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = biadd.nextLine();
        
        // Convert binary strings to integers
        //Integer.parseInt(String s, int radix): Converts the string s into an integer based on the specified radix.
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two numbers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);
        
        //Print the output
        System.out.println("Sum of two binary numbers are: " + binarySum);
		

	}

}
