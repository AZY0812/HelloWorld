public class LogicOperator01 {
	public static void main(String[] args) {
		//短路与
		int age = 50;
		if(age > 20 && age < 90) {
		 System.out.println("OK100");
		}
		
		//逻辑与
		if(age > 20 & age < 90) {
			 System.out.println("OK200");
		}
		
		//逻辑与和短路与的区别
		int a = 4;
		int b = 9;
		//对与&&而言，对于第一个条件为false，后面的条件不在判断
		//对与&而言，如果第一个条件为false，后面的条件任然会判断
		if(a < 10 && ++b < 50) {
			System.out.println("OK300");
		}
		System.out.println("a" + a + "b" + b);
		
		if(a < 1 & ++b < 50) {
			System.out.println("OK400");
		}
		System.out.println("a" + a + "b" + b);
	}
}