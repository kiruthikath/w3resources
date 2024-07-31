/*
 10. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
 */


//Package Declared
package basic_part1;

//Main class
public class Formula10 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing value
		float num1 = 4.0f,  num2 = 1.0f;
		int num3 = 1, num4 = 3, num5 = 5, num6 = 7, num7 = 9, num8 = 11;
		//Computing a operation
		float oper = (num1 * (num3 - (num2/num4) + (num2/num5) - (num2/num6) + (num2/num7) - (num2/num8)));
		//Printing the statement
		System.out.printf("%.16f",oper);
		

	}

}
