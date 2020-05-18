package chapter01;

public class TpyeCast01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//암시적 형변환
		int i = 10;
		long l = i;
		System.out.println(i+":"+l);
		
		//명시적 형변환
		long l2 = 123456789;
		int i2 = (int)l2;

	}

}
