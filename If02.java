import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的年龄"); 
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于18，请对自己的行为负责,送入监狱");
		}
		else {
			System.out.println("你年龄不大这次就放过你了");
		}
		System.out.println("程序继续...");
	}
}