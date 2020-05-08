package chapter01;

public class variableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 자료형(Data Type) : 기본형 - 8개 
		 */
		
		//정수
		byte b = 10;       //1byte
		short s = 10;      //2byte
		int i = 10;        //4byte
		long l = 1234567;  //8byte
		
		//실수
		float f = 3.14f;     //4byte
		double d = 3.14;     //8byte
		
		//문자
		char c1 = 'A';        //2byte
		char c2 = '안';
		
		//부울대수
		boolean boo = true;   //1byte
		
		
		/*
		 * 2. 자료형(Data Type) : 객체 참조형 (Reference type) 
		 */
		
		//문자열 (기본 타입이 아님)
		//문자열은 기본 타입 char가 모여있는 String class이다.
		String str1 = "Hello World";
		String str2 = new String ("Hello World");
		
		int n=10;
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(boo);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(n);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g1.price);
		System.out.println(g2.price);
		
		
		/*
		 * 3. 변수 초기화
		 * 
		 * 지역변수 (블럭({}) 안에서 만들어진 것)
		 *   -지역변수는 반드시 초기화를 해야한다
		 *   -안하면 무조건 오류
		 *    int j;
		 *    System.out.println(j);
		 */
		
		//상수
		
		final int number = 10;
		// 오류 : 초기화시 final이 붙어 있는 변수는 다음 코드에서 값을 대입할 수 없다.
		// number = 20;
		// 관례적으로 상수는 대문자로 표현한다 (변수와 구분하기 위해)

	}

}
