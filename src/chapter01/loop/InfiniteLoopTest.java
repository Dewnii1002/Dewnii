package chapter01;

import java.util.Scanner;

public class InfiniteLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		int sum = 0;
		int value = 0;
		
		/*while(true) {//무한루프
			System.out.println("숫자 입력[-1 to quit]:");
			value = scanner.nextInt();
			if (value == -1) {
				break;
			}
			
			sum += value;

		} 
		*/
		
		for(;;) {//무한루프
			System.out.println("숫자 입력[-1 to quit]:");
			value = scanner.nextInt();
			if (value == -1) {
				break;
			}
			
			sum += value;

		} 

		System.out.println(sum);
		
		scanner.close();

	}

}
