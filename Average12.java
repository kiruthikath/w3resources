/*/
 Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

//Package Decllared
package basic_part1;

//Import the Package
import java.util.Scanner;

//Main class
public class Average12 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner class
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		//Read and store the input
		System.out.println("Enter the input 1: ");
		int num1 = sc1.nextInt();
		System.out.println("Enter the input 2: ");
		int num2 = sc2.nextInt();
		System.out.println("Enter the input 3: ");
		int num3 = sc3.nextInt();
		
		//Compute Average
		int avg = (num1+num2+num3)/3;
		
		//Printing the output
		System.out.println("Average of three numbers are: " + avg);

	}

}
