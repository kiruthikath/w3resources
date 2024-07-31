/*
 9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
 */


//Package Declared
package basic_part1;

//Main class
public class Expressionoperation9 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize value to a variable
		float num1 = 25.5f, num2 = 3.5f, num3 = 40.5f, num4 = 4.5f;
		//Computing a expression
		float exp = (((num1 * num2) - (num2 * num2)) / (num3 - num4));
		//Printing the output
		System.out.printf("%.15f", exp);
		

	}

}
