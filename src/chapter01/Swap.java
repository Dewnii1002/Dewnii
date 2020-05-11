package chapter01;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();     //blocking
		int n2 = s.nextInt();     //blocking
		int swap;
		
		if (n2 > n1) {
			swap = n2;
			n2 = n1;
			n1 = swap;
			
		}
	
		
		//n1이 큰 값이 되도록 출력할 것
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);

	}

}
