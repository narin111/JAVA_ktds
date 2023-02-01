
public class OperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, m = 10;
		int bn = ++n;
		int am = m++; // 1이 증가되기 이전의 값
		System.out.println(bn); // 11
		System.out.println(am); // 10
	}

}
