public class AutoConvertDetail {
	public static void main(String[] args) {
		//有多钟类型数据混合运算时，
		//系统首先自动把所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		float d1 = n1 + 1.1f;
		
		//int n2 = 1.1
		//当把一个数据赋与byte时，先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;//-128~127,范围是没问题的，
		//int n2 = 1;
		//byte b2 = n2;//如果按照变量赋值，判断类型
		//char c1 = b1;//原因byte不能自动转换为char
		
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;// b2 + s1 -> int
		int s2 = s1 + b2;
		
		int b4 = b2 + b3;
		
		//boolean pass = true;
		//int num100 = pass;
		byte b5 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		
		double num500 = b5 + s3 + num200 + num300;
	}
}