package chapter01;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();     //blocking
		int b = s.nextInt();     //blocking
		
		int diff = 0;
		
		if(a > b) {
			
			diff = a - b;		
		}
		
		else {
		    diff = b - a;
		}
		
		
		//diff = (a > b) ? a - b : b - a;
		
		System.out.println(diff);
		

	}

}
