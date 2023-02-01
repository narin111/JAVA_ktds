import java.util.Scanner;

public class DoWhileTest {
	
	// 0이 나오기 전까지 더하는 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl shift o
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int data;
		do {
			data = sc.nextInt();
			sum += data;
		} while(data!=0);
		
		System.out.println(sum);
	}
	

}
