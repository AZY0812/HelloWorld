public class ForceConvert {
	public static void main(String[] args) {
		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1=" +n1);//造成精度损失
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);//造成数据溢出
		
		int x = (int)(3.5* 10 + 6*1.5);
		
		char c1 = 100;
		int m = 100;
		char c2 = (char)m;
		System.out.println(c2);
	}
}