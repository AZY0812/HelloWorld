public class DoWhileExercise {
	public static void main(String[] args) {
	
	int i = 1;
	int count = 0;
	do {
		System.out.println("i =" + i);
		count += i;
		
		i++;
		
	}while(i <= 100);
	System.out.println("count =" + count);
	
	
	
	
	}
}