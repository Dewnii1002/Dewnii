package chapter01;

public class TypeTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 25;   //암시적
		short s = b;   //암시적
		int i = s;     //암시적
		long l = i;    //암시적
		float f = i;   //암시적
		double d = f;  //암시적

		//byte b1 = 256;

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		//System.out.println("b1 = " + b1);


	}

}
