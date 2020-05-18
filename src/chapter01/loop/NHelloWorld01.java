package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		int i = 0;
		while(i<count) {
			System.out.println("HelloWorld");
			i=i+1;
		}
		
		
		
		
		s.close();
		

	}

}
