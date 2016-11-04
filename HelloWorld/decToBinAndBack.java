import java.util.Scanner;

// Caleb Smith
// v0.0.1

public class decToBinAndBack {
	
	
	
	public static void main(String[] args) {
		
		if (getNumberType() == 'b')
		{
			System.out.println("Decimal: " + toDecimal(getNumber()));
		}
		else {
			System.out.println("Binary: "+ toBinary(getNumber()));
		}
			
		
	
	}
	
	static char getNumberType() {
		char numberType = 'X';
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the type of number you'll be entering: [(b)inary, (d)ecimal] ");
		switch (reader.next().toLowerCase().charAt(0))
		{
			case 'b':
				numberType = 'b';
				break;
			case 'd':
				numberType = 'd';
				break;
			default:
				System.out.print("invalid input, you're dumb");
				System.exit(0);
			
		}
		return(numberType);
	}
	
	static int getNumber() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		return(reader.nextInt());
	}
	
	static int toDecimal(int arg) {
		int newNum = 0;
		String temp = "";
		
		System.out.println("Binary: " + arg); // 1011
		
		temp = Integer.toString(arg);
		int numArray[] = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			numArray[i] = temp.charAt(i) - '0';
			
		}
		for (int i = 0; i < temp.length(); i++)
		{
			newNum += (numArray[i] * Math.pow(2, (numArray.length - 1 - i )));
		}
		return(newNum);
	}
	
	static int toBinary(int arg) {
		int newNum = 0;
		int temp = 0;
		
		if (arg < 0) {
			System.out.println("Detected negative decimal number, converting of negative numbers is not supported.");
			System.exit(0);
		}
		
		if (getHighestPowerOfTwo(arg) == 0) {
			System.out.println(newNum);
		} else {
			for (int i = 0; i>=)
		}
		
		return(newNum);
	} 
	
	static int getHighestPowerOfTwo(int arg) {
		int temp = 0;
		
		for (int i = 0; Math.pow(2,i) < arg; i++)
		{
			System.out.println("[d] i: " + i);
			temp = (int)Math.pow(2, i);
			System.out.println("[d] temp: " + temp);
			
		}
		return(temp);
	}

}
