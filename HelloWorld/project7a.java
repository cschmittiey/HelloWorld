import java.io.*;
import java.util.*;

public class project7a {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("What is the area? ");
		double d = reader.nextDouble();
		double radius = Math.sqrt(d/Math.PI); 
		System.out.println("Radius of your circle is " + radius);
	}

}
