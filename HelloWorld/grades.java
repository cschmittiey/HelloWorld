import java.util.Scanner;
import java.util.Arrays;
// Caleb Smith
// v0.0.1

// input grades
// print mean, median
// print letter grades for mean and median

public class grades {

	public static void main(String[] args) {
		System.out.println("Chunky Bacon Grade Analyzer \n");
		
		Scanner reader = new Scanner(System.in); //inits input

		
		//gets how many grades will be inputted, this is needed to init the array with grades
		
		System.out.println("How many grades will you be putting in? ");
		int gradeArrayLength = reader.nextInt();
		double gradeArray[] = new double[gradeArrayLength];
		System.out.println("Okay, " + gradeArrayLength + " grades.");  
		
		
				
		//populates grade array 
		int i = 0; 
		while(gradeArray[gradeArrayLength - 1] == 0)
		{
			System.out.println("Enter grade #" + (i+1));
			gradeArray[i] = reader.nextDouble();
			i++;
		}
		
		//gets mean (grrr)
		
		System.out.println("===================");
		double total = 0;
		for (int e = 0; e < gradeArray.length; e++)
		{
			total += gradeArray[e];
		}
		System.out.println("Grade Mean: " + (total / gradeArray.length) + " (" + getGradeLetter((total / gradeArray.length)) + ")");
		
		//sort array for median 
		//you're right, i'm lazy and didn't write my own
		//why write my own when it is already there for the taking?
		Arrays.sort(gradeArray);
		
		double median = 0;
		if (gradeArray.length % 2 == 0)
		{
			median = ( (gradeArray[(gradeArray.length / 2)] + gradeArray[(gradeArray.length / 2 - 1)] ) / 2); // this is some gnarly code right here -- in an array of 6, it'd return (array[3]+array[4])/2
		}
		else
		{
			median = ( gradeArray[(int)Math.ceil((double)gradeArray.length / 2.0)]); //less gnarly, just finds the middle array element
		}
		System.out.println("Grade Median: " + median + " (" + getGradeLetter(median) + ")");
	}
	
	static String getGradeLetter(double grade) {
		if (grade >= 0 && grade < 60){
			
			return "F";
		}
		else if (grade >= 60 && grade < 63)
		{
			return "D-";
		}
		else if (grade >= 63 && grade < 67)
		{
			return "D";
		}
		else if (grade >= 67 && grade < 70)
		{
			return "D+";
		}
		else if (grade >= 70 && grade < 73)
		{
			return "C-";
		}
		else if (grade >= 73 && grade < 77)
		{
			return "C";
		}
		else if (grade >= 77 && grade < 80)
		{
			return "C+";
		}
		else if (grade >= 80 && grade < 83)
		{
			return "B-";
		}
		else if (grade >= 83 && grade < 87)
		{
			return "B";
		}
		else if (grade >= 87 && grade < 90)
		{
			return "B+";
		}
		else if (grade >= 90 && grade < 93)
		{
			return "A-";
		}
		else if (grade >= 93 && grade < 97)
		{
			return "A";
		}
		else if (grade >= 97 && grade < 100)
		{
			return "A+";
		}
		else return "";
			
	}

}
