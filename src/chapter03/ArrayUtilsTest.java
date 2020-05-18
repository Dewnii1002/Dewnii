package chapter03;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10, 20, 30, 40};
		double [] d1 = {10.1, 20.2, 30.3, 40.4};
		
		double[] d2 = ArrayUtils.intToDouble(a);
		for(double v : d2){                    //forEach(개별적으로 접근한다)
		System.out.println(v);
		}
		
		int [] a2 = ArrayUtils.doubleToInt(d1);
		for(double v : d2){                    //forEach(개별적으로 접근한다)
			System.out.println(v);
			}
		
		int[] a3 = ArrayUtils.concat(a1,a2);
		for(int v :a3) {
			System.out.println(v);
			
		}

	}

}
