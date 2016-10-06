import java.util.Scanner;

// Caleb Smith
// v0.0.1

public class pizzaCost {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Diameter of the pizza in inches: ");
		double diam = reader.nextDouble();
		System.out.println("The cost of making the pizza is: " + ( ( 0.05 * (diam * diam) ) +  1.75 ) );

	}
}
