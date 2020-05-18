package chapter01.array;

public class ArrayTest01 {

	public static void main(String[] args) {
		// 배열이 왜 필요한가
		int[] scores = new int[6];

		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 90;
		scores[3] = 70;
		scores[4] = 100;
		scores[5] = 100;
	

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		float average = sum / scores.length;
		System.out.println(average);

	}
}
