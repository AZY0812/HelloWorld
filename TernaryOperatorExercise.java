public class TernaryOperatorExercise {
	public static void main(String[]  args) {
		
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		
		//先得到n1和n2中的最大的数，保存到max1
		//然后再求出max1与n3中最大的数，保存到max2
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数 = " + max2);
		
		//使用一条语句实现
		int max = (n1 > n2 ? n1 : n2) > n3 ? 
				(n1 > n2 ? n1 : n2 ) : n3;
		System.out.println("最大数 = " + max);
		
		
		
	}
}