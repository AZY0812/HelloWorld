public class LogicOperator02 {
	public static void main(String[] args) {
		//||短路或 和 |逻辑或
		int age = 50;
		if(age > 20 || age < 90) {
		 System.out.println("OK100");
		}
		//对与||而言，两个条件只要有一个成立，结果为true，否则为false
		//对与|而言，两个条件只要有一个成立，结果为true，否则为false
		
		//逻辑或
		if(age > 20 | age < 90) {
			 System.out.println("OK200");
		}
		
		//逻辑或和短路或的区别
		int a = 4;
		int b = 9;
		//对与||而言，如果第一个条件为true，则第二个条件不会判断，效率高
		//对与|而言，不管第一个条件是否为true，第二个条件都要判断，效率低
		if(a >1 || ++b > 4) {
			System.out.println("OK300");
		}
		System.out.println("a" + a + "b" + b);
		
		if(a < 1 | ++b < 50) {
			System.out.println("OK400");
		}
		System.out.println("a" + a + "b" + b);
	}
}