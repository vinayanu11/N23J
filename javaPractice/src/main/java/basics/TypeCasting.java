package basics;

public class TypeCasting {

	public static void main(String[] args) {
		int a=5;
		System.out.println(a);
		
		//float b=(float)a;//explicit
		float b=a;//implicit
		System.out.println(b);
		
		int c=(int) b;
		System.out.println(c);
		
		/* Explicit type casting examples */
		
		byte d=23;
		int e=d;//128+127+1
		
		int f=129;//128,256,300;
		byte g=(byte)f;
		System.out.println(g);
		//convert char to int
		
		char h='a';
		System.out.println(h);
		int i=h;
		System.out.println(i);
		
		//convert int to char
		
		int s=65;
		char k=(char)s;
		System.out.println(k);
		
		
		

	}

}
