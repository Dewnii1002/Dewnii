package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력>");
		int number = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

		// 자원정리
		scanner.close();

	}

}
