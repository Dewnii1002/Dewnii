package chapter03;

public class ArrayUtils {
	
	public static double[] intToDouble(int[] a){
		double[] result = new double[a.length];
		for(int i = 0; i <a.length; i++) {
			result[i] = a[i];
		}
		return result;
		
	}

	public static int[] doubleToInt(double[] d1) {
		int[] result = new int[d1.length];
		for(int i = 0; i < d1.length; i++) {
			result[i] = (int)d1[i];
		}
		return result;
	}
	
	public static int[] concat(int[] a1, int[]a2) {
		
		return null;
	}

}
