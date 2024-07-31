/*/
 4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
 */

//Declared package
package basic_part1;

//Main class
public class Arithmeticsoprs4 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a 
		//Initializing value
		int num1 = -5, num2 = 8, num3 = 6;
		//Operating
		int a = num1 + num2 * num3;
		//Printing the statement
		System.out.println(a);
		
		//b
		//Initializing value
		int num4 = 55, num5 = 9;
		//Operating
		int b = (num4+num5) % num5;
		//Printing the statement
		System.out.println(b);
		
		//c
		//Initializing value
		int num6 = 20, num7 = -3, num8 = 5;
		//Operating
		int c = num6 + (num7*num8) / num2;
		//Printing the statement
		System.out.println(c);
		
		//d 
		//Initializing value
		int num9 = 15, num10 = 3,num11 = 2;
		//Operating
		int d = num8 + num9 / num10 * num11 - num2 % num10;
		//Printing the statement
		System.out.println(d);
				
		
		
		

	}

}
