package chapter03;

public class StaticMethod {
	
	int n;
	static int m;
	
	void f1() {
		n =1; // 인스턴스 메소드에서 인스턴스 변수 접근 가능
		
	}
	
	void f2() {
		
		m=2;  // 인스턴스 메소드에서 클래스(static) 변수 접근 가능
	          // StaticMethod.m =2 가 원칙
	          // 단, 같은 클래스에서는 클래스 이름 생략 가능
	}

	void f3() {
		
		s1();  // 인스턴스 메소드에서 클래스(static) 변수 접근 가능
	           // StaticMethod.s1() 이 원칙
	          // 단, 같은 클래스에서는 클래스 이름 생략 가능
	}
	
	static void s1() {
		//error : 클래스 메소드에서 인스턴스 변수 접근 불가능
		//n =1; 
	}
	
	static void s2() {
		// 클래스 메소드에서 클래스 변수 접근 가능
		m=1;
	}
	
	static void s3() {
		// error : 클래스 메소드에서 인스턴스 메소드 접근 불가능
		//f1();
		
		//// 클래스 메소드에서 클래스 메소드 접근 가능
		s1();
	}

}
