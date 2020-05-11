package chapter01;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();     //blocking
		int a2 = s.nextInt();     //blocking
		int a3 = s.nextInt();
		
		int max = 0;
		
		if (a1 >= a2) {
			if(a1>=a3) { // a1>=a2, a1>=a3
				max = a1; 
			}
			else {       // a1>=a2, a1<=a3
				max = a3;
				}
		}
			else {
				if(a2 >= a3) {
					max = a2;
				}
				else {
					max = a3;
				}
			}
			
			

		
		System.out.println("max:"+ max);


	}

}
