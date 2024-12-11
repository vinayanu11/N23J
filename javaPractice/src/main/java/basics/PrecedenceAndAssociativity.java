package basics;

public class PrecedenceAndAssociativity {

	public static void main(String[] args) {
	  int m,n,o,p;
		/*Example 1
		 * m=3; n=5; o=7; p=6;
		 */
		/*Example 2
		 * m=64; n=8; o=4; p=2;
		 */
		/*Example 3 m=n=o=p=64; */
	 
	  m=64; n=8; o=4; p=2;
	  int x=m+n*o-p;
	  System.out.println(x);
	  int y=m/n/o/p;
	  System.out.println(y);
	  double z=m*n/o+p;
	  System.out.println(z);
	  double z1=m*n-o/p;
	  System.out.println(z1);
	  double result=5+2*3-4/2;
	  System.out.println(result);
	  double result1=5+2*3-4/2%5-2;
	  //5+6-2%5-2
	  System.out.println(result1);
	  double result2=2%5;
	  System.out.println(result2);
	}

}
