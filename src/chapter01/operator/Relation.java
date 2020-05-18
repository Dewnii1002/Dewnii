package chapter01;

public class Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		boolean bool = a == b;
		//관계연산자가 대입연산자보다 우선순위가 있음
		System.out.println(bool);
		
		System.out.println(a >= b - 10);
		//산술 연산자가 관계연산자보다 우선순위가 있음

	}

}
