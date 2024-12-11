package basics;

public class TernaryOperator {

	public static void main(String[] args) {
		/* ---------Ternary Operator--------- */
        //(a>b)?a:b;
		int a=10;
		int b=9;
		int c=7;
		/* Greatest of 3 Numbers */
		System.out.println((a>b)?a:b);
		System.out.println((a>b)?(a>c?a:c):(b>c)?b:c);
		
		/* Smallest of 3 Numbers */
		System.out.println((a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c));
	}

}
