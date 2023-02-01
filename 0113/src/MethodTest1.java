class Calculator{
	// int number;
	int val1;
	int val2;
	
	public Calculator(int val) {
		// System.out.println("생성자 자동 호출 확인"); // 컴파일 시에
		this.val1 = val1;
		this.val2 = 0;
	}
	public Calculator(int val1, int val2) {
		this.val1 = val1; // 인스턴스 변수에 넣어줌
		this.val2 = val2;
	}
	int add() {
		return val1+val2;
	}
	
	int add(int data1, int data2) {
		return data1 + data2;
	}
	
	int add(int d1, int d2, int d3) { // 메소드 오버로딩
		return d1 + d2 + d3;
	}
}// 시험문제?

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator(1);
		Calculator cal2 = new Calculator(3, 4);
		
	}

}
