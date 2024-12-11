package basics;

public class Operators {

	public static void main(String[] args) {
		/* Modulus Operator */
		int a=10;
		int b=9;
		//int c=7;
		int c=a%b;
		System.out.println(c);
		
		/* Increment and Decrement */
		System.out.println("-----------Increment/decrement----");
		a--;
		System.out.println(a);//672
		--a;
		System.out.println(a);//671
		b++;
		System.out.println(b);
		++b;
		System.out.println(b);
		
		/* ---------Ternary Operator--------- */
        //(a>b)?a:b;
		
		System.out.println((a>b)?a:b);
		System.out.println((a>b)?(a>c?a:c):(b>c)?b:c);
		//System.out.println((a>b)?(b>c?b:c):(a>c)?a:c);
	}

}
