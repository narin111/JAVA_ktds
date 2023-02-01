class MyClass3{
	static int[] narr = new int[10];
	static {
		for(int i=0; i<narr.length; i++) {
			narr[i] = (int)(Math.random() *100)+1;
		}
	}
}

public class StaticTest3{
	public static void main(String[] args) {
		
	}
}