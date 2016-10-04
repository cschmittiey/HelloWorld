import java.util.Scanner;

// Caleb Smith
// v0.0.1
public class project11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = reader.nextLine().toLowerCase();
		int nameLen = name.length();
		for(int n = nameLen - 1; n >= 0; n-- )
		{
			System.out.print(name.charAt(n));
		}	
	}

}
