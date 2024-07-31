/*/
 15. Write a Java program to swap two variables.
 */
//Package Declared
package basic_part1;

//Import Package
import java.util.Scanner;

//Main class
public class Swap15 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare 2 variables
		int input1,input2,temp;
		//Scanner class
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		//Read and store the input
		
		System.out.println("Enter the first input: ");
		input1 = sc1.nextInt();
		System.out.println("Enter the second input: ");
		input2 = sc2.nextInt();
		
		System.out.println("Before Swapping.....");
		System.out.println("First input: " + input1);
		System.out.println("Second input: " + input2);
		
		//Swapping 2 numbers
		temp = input1;
		input1 = input2;
		input2 = temp;
		
		//Printing the output
		System.out.println("After Swapping.....");
		System.out.println("First input: " + input1);
		System.out.println("Second input: " + input2);
		

	}

}
