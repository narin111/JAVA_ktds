
public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		if(a < b && ++b == 6) {
			// && 앞의 값이 틀렸기 때문에
			// ++b 연산을 하지 않는다
		}
		// 따라서 출력은 5
		System.out.println(b);
		
		
		int t = 100;
		t *=3+5; // t= t*(3+5) => 800
		System.out.println(t);
	}

}
