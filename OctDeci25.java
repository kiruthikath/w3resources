/*
 25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
 */

//Package Declared
package basic_part1;

//Import Package
import java.util.Scanner;

//Main class
public class OctDeci25 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner ocDe = new Scanner(System.in);
		
		//Read and store the input
		System.out.print("Enter the Octal input: ");
		String octNum = ocDe.nextLine();
		
		//Convert the Octal number to decimal number
		int octDeci = Integer.parseInt(octNum, 8);
		
		//print the output
		System.out.println("The Decimal Representation of " + octNum + " number is: " + octDeci);
		
	
		

	}

}
