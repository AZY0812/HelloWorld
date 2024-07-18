public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		
		//int i = 1;
		//i = i++;//规则使用临时变量 （1）temp=1;(2)i=i+1;(3)i=temp;
		//System.out.println(i);
		
		int a = 1;
		a = ++a;//使用规则变量 (1)a=a+1;(2)temp=i;(3)i=temp;
		System.out.println(a);
		
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
		i = --i2;
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
	}
}