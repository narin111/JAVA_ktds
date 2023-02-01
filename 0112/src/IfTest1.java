
public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 95, eng = 88, math  = 75;
		double avg = (kor+eng+math)/3.0;
		String grade;
		if(avg>=90) {
			grade = "A";
			if(avg>=98) grade += "+";
			else if(avg<94) grade += "-";
		} else if(avg >= 80) {
			grade = "B";
			if(avg>=88) grade += "+";
			else if(avg<84) grade += "-";
		} else if(avg >= 70) {
			grade = "C";
			if(avg>=78) grade += "+";
			else if(avg<74) grade += "-";
		} else if(avg >= 60) {
			grade = "D";
			if(avg>=68) grade += "+";
			else if(avg<64) grade += "-";
		} else {
			grade = "F";
			
		}
		System.out.println("평균:"+avg+", 학점:"+grade);
		
		
//		switch((int)avg/10) {
//			case 10:
//			case 9: 
//				grade = 'A';
//				break;
//			case 8:
//				grade = 'B';
//				break;
//			case 7:
//				grade = 'C';
//				break;
//			case 6:
//				grade = 'D'; 
//				break;
//			default: 
//				grade = 'F';
//		}
		
		
	} 

}
