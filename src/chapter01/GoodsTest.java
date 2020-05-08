package chapter01;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		Goods g1 = new Goods();
		g1.price= 1000;
		
		//=================================================
		
		int j = i;
		Goods g2 = g1;
		
		System.out.println(i+":"+j);
		System.out.println(g1.price+":"+g2.price);
		
		String s = "hello world";
		System.out.println(s);

	}

}
