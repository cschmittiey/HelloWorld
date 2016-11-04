import java.util.Scanner;

// Caleb Smith
// v0.0.1

public class decToBinAndBack {
	
	
	
	public static void main(String[] args) {
		
		if (getNumberType() == 'b')
		{
			toDecimal(getNumber());
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
		int num = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		return(reader.nextInt());
	}
	
	static int toDecimal(int arg) {
		int newNum = 0;
		String temp = "";
		String rtemp = "";
		
		System.out.println("Binary:" + arg); // 1011
		
		temp = Integer.toString(arg);
		System.out.println(temp);
		int numArray[] = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			numArray[i] = temp.charAt(i) - '0';
			System.out.println(numArray[i]);
			
		}
		for (int i = 0; i < temp.length(); i++)
		{
			System.out.println(numArray[i] * Math.pow(2, (numArray.length - 1 - i )));
			
		}
		return(newNum);
	}

}
