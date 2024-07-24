public class ForDetail {
	public static void main(String[] args) {
		int i = 1;
		for(; i <= 10; ) {
			System.out.println("你好，韩顺平教育" + i);
			i++;
		}
		
	System.out.println("i = " + i);
	
	int count = 3;
	for(int a = 0, j = 0; a < count; a++, j+=2) {
		System.out.println("a=" + a + "j=" + j);
	}
	}
}