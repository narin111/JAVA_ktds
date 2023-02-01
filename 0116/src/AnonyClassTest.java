class Number{
	int m = 10;
	int method() {
		return m;
	}
}

public class AnonyClassTest {
	public static void main(String[] args) {
		
		// 익명클래스 Number: 조상클래스
		// 즉, Number 클래스로부터 상속받아 n 변수를 추가하고, method 재정의
		Number number = new Number() {
			int n = 20;
			@Override
			int method() {
				return super.method()+n;
			}
		};
		System.out.println(number.method());
	}
}
