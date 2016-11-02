import java.util.Scanner;

// Caleb Smith
// v0.0.1

public class decToBinAndBack {

	public static void main(String[] args) {
		char numberType = '';
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the type of number you'll be entering: [(b)inary, (d)ecimal] ");
		switch (reader.nextChar())
		{
			case 'b':
				numberType = 'b'
				break;
			case 'd'
				numberType = 'd'
				break;
			default:
				System.out.println("invalid input, you're dumb")
				System.exit(0);
			
		}

}
