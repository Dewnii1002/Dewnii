package chapter01;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 5;
		
		System.out.println(a == b || a > b);
		//f || t => t
		//t || f => t
		//t || t => t
		//f || f => f
		
		System.out.println(a == b && a > b);
		//f && t => f
		//t && f => f
		//t && t => t
		//f && f => f
		
		System.out.println(a != b || a > b);
		System.out.println(a != b && a > b);
		
		//not
		System.out.println(!(a > b)); //a <= b
		

	}

}
