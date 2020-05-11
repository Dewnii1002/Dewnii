package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("승수를 입력하시오: ");
		int power = s.nextInt();
		int result = 1;
		int i = 0;
		while(i<power) {
			result = 2*result;     //result *= 2;
			i++;
		}
		
		System.out.println("2의 "+power+"승은 "+result+"입니다.");
		s.close();

	}

}
