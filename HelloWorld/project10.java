// Caleb Smith
// v0.0.1
import java.util.Scanner;

public class project10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("What is your weight on the Earth? ");
		int earthWeight = reader.nextInt();
		System.out.print(" 1. Voltar \n 2. Krypton \n 3. Fertos \n 4. Servontos \n \n Selection? ");
		int selection = reader.nextInt();
		switch(selection)
		{
		case 1:
			System.out.println("Your weight on Voltar would be " + (earthWeight * 0.091));
			break;
		case 2:
			System.out.println("Your weight on Krypton would be " + (earthWeight * 0.720));
			break;
		case 3:
			System.out.println("Your weight on Fertos would be " + (earthWeight * 0.865));
			break;
		case 4:
			System.out.println("Your weight on Servontos would be " + (earthWeight * 4.612));
			break;
		}
	}

}
