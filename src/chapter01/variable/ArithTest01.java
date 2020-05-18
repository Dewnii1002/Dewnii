package chapter01.variable;

public class ArithTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 7;
		
		//산술연산 (Arithmetic Operator)
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//int op int => int
		
		System.out.println(10/3);
		
		// int op double => double
		
		System.out.println(10/3.);
		
		//주의
		System.out.println((double)10/3);
		System.out.println((double)(10/3));
		
		//증감 (단항연산자) i++, ++i
		a = 1;
		
		System.out.println(a);
		a++; // a = a + 1
		     // a += 1
		System.out.println(a);
		
		a--; //a -= 1
		     //a = a - 1
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		a = 1;
		System.out.println(++a);
		System.out.println(a);
		// a = a + 1
		//System.out.println(a);
		
		a = 1;
		System.out.println(a++);
		System.out.println(a);
		//System.out.println(a);
		// a = a + 1
		
		

	}

}
