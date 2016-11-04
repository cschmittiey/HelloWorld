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
		char numberType = 'X'; //I just put X in because eclipse complains if there's a chance of it not being initialized
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the type of number you'll be entering: [(b)inary, (d)ecimal] ");
	
		// I know this looks weird, but it allows people to enter both b, binary, Binary, BINARY, BARNARY, etc and still work.
		switch (reader.next().toLowerCase().charAt(0))
		{
			case 'b':
				numberType = 'b';
				break;
			case 'd':
				numberType = 'd';
				break;
			default:
				System.out.print("Sorry, you must enter either binary or decimal.");
				System.exit(0);
			
		}
		return(numberType);
	}
	
	static int getNumber() { // Does exactly what you think it does
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		return(reader.nextInt());
	}
	
	static int toDecimal(int arg) {
		int newNum = 0;
		String temp = "";
		
		System.out.println("Binary: " + arg); 
		
		temp = Integer.toString(arg); //only way to get an int's length is to convert it to a string
		
		int numArray[] = new int[temp.length()]; // This takes that string and populates an array with each number, 1011 -> "1011" -> [1,0,1,1]
		for (int i = 0; i < temp.length(); i++)
		{
			numArray[i] = temp.charAt(i) - '0';
			
		}
		
		
		for (int i = 0; i < temp.length(); i++) // I was going to flip the array backwards, but Luis showed me this and it seemed easier
		{
			newNum += (numArray[i] * Math.pow(2, (numArray.length - 1 - i )));
		}
		return(newNum);
	}
	
	static String toBinary(int arg) {
		
		String newNum = "";
		int temp[] = new int[getHighestPowerOfTwo(arg)]; //test 4
        int j = 0;
		while ( arg > 0 ) {
		    temp[j] = arg % 2;
		    arg = arg / 2 ;
		    j++;
		}
		for(int i = j - 1 ; i >= 0 ; i--){
			newNum += Integer.toString(temp[i]);
		}
		return(newNum);
	}

	static int getHighestPowerOfTwo(int arg) { // Uses a loop to find what the highest power of two a number can be divided by.
		int temp = 0;
		
		for (int i = 0; Math.pow(2,i) < arg; i++)
		{
			temp = (int)Math.pow(2, i);
			
		}
		return(temp);
	}

}
