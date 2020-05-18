package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0에서부터 계속 더하다가 합이 5000 이상이 되면 중지
		
		/*int number = 0;
		int sum = 0;

		while (sum + number < 5000) {
			sum += number;
			number++;
		}
		System.out.println(sum + ":" + number);
        */
		int number = 0;
		int sum = 0;

		while (sum + number < 5000) {
			sum += number;
			if(sum>5000) {
				break;
			}
			number++;
		}
		System.out.println(sum + ":" + number);
		
	}
	

}
