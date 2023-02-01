class TempClass{
	// 클래스는 메소드를 통해서만 접근할 수 있도록 하는 것이 원칙
	int value;
	static int svalue;
	
	// 외부에서 사용할 수 있음
	// 인스턴스 메서드
	// 인스턴스 메서드에서는 클래스 내 모든 변수 함수 접근 가능
	void func() {
		value = 10;
		svalue = 20;
		sfunc();
	}
	// 인스턴스 변수
	void func2() {
		func();
	}
	static void sfunc() {
		// value = 1; 
		// func();
		// static 메소드에선 인스턴스 변수나 메서드에 접근할 수 없음 - 객체생성되어야만 생성될 수 있는 변수를 불러서 에러 
		svalue = 2;
		sfunc2();
	}
	static void sfunc2() {
		
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		TempClass.svalue = 100; // class 이름을 통해 객체 생성 없이도 접근가능
		System.out.println(TempClass.svalue); //100
		
		TempClass tc = new TempClass();
		tc.value = 200; // 객체 생성 후 레퍼런스 변수를 통해서만 접근가능
		System.out.println(tc.value); //200
		System.out.println(tc.svalue); //100
		
		tc.sfunc();
	}
}
