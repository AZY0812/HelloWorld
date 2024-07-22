public class BitOperator02 {
	public static void main(String[] args) {
		
		System.out.println(1 >> 2);//0
		System.out.println(1 << 2);//0
		System.out.println(4 << 3);// 4 * 2 * 2 * 2 = 32
		System.out.println(15 >> 2);// 15 / 2 / 2 = 3
		
		double num4 = 8;
		System.out.println(num4);
		
		String str = "18.8";
		double d = Double.parseDouble(str);
		System.out.println(d);
		
		char c1 = '韩';
		String str2 = c1 + "";
		System.out.println(str2);
	}
}