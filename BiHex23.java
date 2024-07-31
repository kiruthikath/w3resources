/*
 23. Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
 */


//Package Declared
package basic_part1;

//Package imported
import java.util.Scanner;

//Main class
public class BiHex23 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner biHex = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the binary number: ");
		String binaryNum = biHex.nextLine();
		
		//Convert the binarynamuber into decimal number
		int decimalNum = Integer.parseInt(binaryNum,2);
		
		//Convert decimalNumber to hexadecimal number
		String hexNum = Integer.toHexString(decimalNum).toUpperCase();
		
		//print the output
		System.out.println("The Hexadecimal representation of " + binaryNum + " number is: " + hexNum);
		
	

	}

}
