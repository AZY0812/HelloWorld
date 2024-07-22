public class IfExercise01 {
	public static void main(String[] args) {
		
		
		double x = 34.5;
		double y = 2.6;
		
		if (x > 10.0 && y <20 ) {
			
			System.out.println("两个数的和 " + (x + y));
		}
		//定义两个变量，其和能被3和5整除时，输出信息。
		int num1 = 10;
		int num2 = 6;
		int sum = num1 + num2;
		if(sum %  3 == 0 && sum % 5 == 0) {
			System.out.println("其和可以被3又能被5整除");
		}else {
			System.out.println("其和不能被3和5整除");
			
		}
		
		//判断一个年份是否是闰年，闰年条件符合下列两者之一
		//（1）年份可以被4整除，但不能被100整除；（2）能被400整除
		 int year = 2015;
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			 System.out.println(year + "是闰年");
			 }else {
				System.out.println(year + "不是闰年");
			 }
		
		
	}
}