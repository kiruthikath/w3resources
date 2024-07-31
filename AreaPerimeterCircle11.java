/*/
 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

//Package Declared
package basic_part1;

//Main class
public class AreaPerimeterCircle11 {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius = 7.5f, pi =3.14f;
		//Compute area of a circle
		float area = pi*(radius*radius);
		//Printing the area output
		System.out.printf("Area is = " + area);
		
		//Compuute perimeter of a circle
		float perimeter = 2 * pi * radius;
		//Printing the perimeter output
		System.out.printf("\nPerimeter is = " + perimeter);
		

	}

}
