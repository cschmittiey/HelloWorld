// Caleb Smith
// v0.0.1
public class project5 {

	public static void main(String[] args) {
		double d1 = 37.9;
		int i1 = 12;
		int i2 = 18;
		p("Problem 1: " + ( 57.2 * ( i1 / i2) + 1));
		p("Problem 2: " + ( 57.2 * ((double) i1 / i2 ) + 1));
		p("Problem 3: " + ( 15 - i1 * ( d1 * 3 ) + 4));
		p("Problem 4: " + ( 15 - i1 * (int)( d1 * 3 ) + 4));
		p("Problem 5: " + ( 15 - i1 * ((int) d1 * 3 ) + 4));
	}
	
	static void p(int a) {
		System.out.println(a);
	}
	static void p(double a) {
		System.out.println(a);
	}
	static void p(String a) {
		System.out.println(a);
	}

	
}
