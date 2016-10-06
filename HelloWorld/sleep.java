import java.util.Scanner;

// Caleb Smith
// v0.0.1
public class sleep {

	public static void main(String[] args) {
		//Get birthdate
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your birthdate: ");
		System.out.print("Year: ");
		int birthYear = reader.nextInt();
		System.out.print("Month: ");
		int birthMonth = reader.nextInt();
		System.out.print("Day: ");
		int birthDay = reader.nextInt();
		
		//Get current date
		System.out.println("Please enter the current date: ");
		System.out.print("Year: ");
		int year = reader.nextInt();
		System.out.print("Month: ");
		int month = reader.nextInt();
		System.out.print("Day: ");
		int day = reader.nextInt();
		
		//Convert years and months to days
		int totalYears = year - birthYear;
		int yearDays = totalYears * 365;
		int totalMonths = month - birthMonth;
		int monthDays = totalMonths * 30;
		int totalDays = yearDays + monthDays + (day - birthDay);
		
		System.out.println("You have been alive for " + totalDays + " days.");
		System.out.println("You have slept for " + ((totalDays * 24) / 3) + " hours.");
		
	}

}
