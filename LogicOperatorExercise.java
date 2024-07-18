public class LogicOperatorExercise {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) {
			x = 11;
			
		}
		System.out.println("x =" + x + ",y = " + y);
		
		int x1 = 5;
		int y1 = 5;
		
		if (x1++ == 6 && ++y1 ==6) {
			x1 = 11;
			
		}
		System.out.println("x1 =" + x1 + ",y1 = " + y1);
		
		int x2 = 5;
		int y2 = 5;
		
		if (x2++ == 6 | ++y2 ==6) {
			x2 = 11;
			
		}
		System.out.println("x2 =" + x2 + ",y2 = " + y2);
		
		int x3 = 5;
		int y3 = 5;
		
		if (x++ == 6 || ++y ==6) {
			x3 = 11;
			
		}
		System.out.println("x3 =" + x3 + ",y3 = " + y3);
		
		
	}
}