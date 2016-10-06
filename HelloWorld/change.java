import java.util.Scanner;

// Caleb Smith
// v0.0.1

public class change {

	public static void main(String[] args) {
		int q=0, qm=0, d=0, dm=0, n=0, nm=0, p=0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the change in cents: ");
		int change = reader.nextInt();
		
		System.out.println("The minimum number of coins is: ");
		if (change > 25)
		{
			q = change / 25; //8 * 25 = 200
			qm = change % 25;//12
		}
		System.out.println("Quarters: " + q);		
		if (qm > 10)
		{
			d = qm / 10;
			dm = qm % 10;
		}
		System.out.println("Dimes: " + d);
		if (dm > 5)
		{
			n = dm / 5;
			nm = dm % 5;
		} else {
			nm = dm;
		}
		System.out.println("Nickels: " + n);
		System.out.println("Pennies: " + nm);

	}
}
