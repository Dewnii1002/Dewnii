package chapter01;

public class ContinueTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10 중에 5보다 작은 수만 출력하세요.
		for(int i = 1; i <= 10; i++) {
			if(i>=5) {
				continue;//루프를 벗어나지는 않음
			}
			System.out.println(i);
		}

	}

}
