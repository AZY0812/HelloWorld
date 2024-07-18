 public class ArithOperatorExercise02 {
	 public static void main (String[] args) {
		
		 //1需求：
		 //假如还有59天放假，问：合xx个星期零xx天
		 //2.思路分析
		 //（1）使用int 变量 days 保存天数
		 //（2）一个星期七天 星期数： days / 7 零xx天 : days % 7
		 // (3)输出
		 
		 //3. 走代码
		 
		 int days = 59;
		 int weeks = days / 7;
		 int leftDays = days % 7;
		 System.out.println(days + "天 合" + weeks + "星期 零" + leftDays + "天" );
		 
		//1需求：
		//定义一个变量保存华氏温度，华氏温度转换为摄氏温度的公式为
		//：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
		//2.思路分析
	    //（1）先定义double huaShi 变量 保存华氏温度
		//（2）根据给出的公式，计算即可5/9*（华氏温度-100）
		// 考虑数学语言与java的特性
		// (3)将得到的结果保存到double sheShi
		//3. 走代码
		 
		 double huaShi = 234.6;
		 double sheShi = 5.0 / 9 * (huaShi - 100);
		 System.out.println("华氏温度" + huaShi + "对应的摄氏温度 = " + sheShi);
		 
	 }
}