import java.util.Scanner;
public class DoWhileExercise02 {
	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	int i = 1;
	char answer = ' ';
	do {
		System.out.println("老韩使出五连鞭法");
		System.out.println("老韩问；还钱吗？y/n");
	    answer = myScanner.next().charAt(0);
	    System.out.println("他的回答是" + answer);
	}while(answer != 'y');
	    System.out.println("李三还钱了");
	
	
	
	
	}
}