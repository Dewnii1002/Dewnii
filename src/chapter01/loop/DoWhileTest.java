package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int value = 0;
		do {
			System.out.println("숫자 입력[-1 to quit]:");
			value = scanner.nextInt();
			if (value != -1) {
				sum += value;
			}

		} while (value != -1);

		System.out.println(sum);
		
		scanner.close();

	}

}
