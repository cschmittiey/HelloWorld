// Caleb Smith
// v0.0.1
import java.util.Scanner;

public class project9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userInput = reader.nextInt();
		if ( (userInput % 2) == 0 )
		{
			System.out.println("The integer " + userInput + " is even");
		}
		else
		{
			System.out.println("The integer " + userInput + " is odd");
		}

	}

}
