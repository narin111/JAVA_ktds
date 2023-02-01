class Test{
	void tfunc1() {}
	static void tfunc2(){}
}
public class ClassTest2 {
	public void func1() {}
	public static void func2() {}
	public static void main(String[] args) {
		ClassTest2 ct = new ClassTest2();
		ct.func1();
		func2();
		
		Test test = new Test();
		test.tfunc1();
		
		Test.tfunc2();
		
		
	}
}
