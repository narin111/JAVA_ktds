
public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan = 2; dan<10; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.print(dan+" x "+i+" = "+(dan*i) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("$$$$$$$while$$$$$$$");
		
		int dan1 = 2, dan2=1;
		
		while(dan1<10) {
			while(dan2<10) {
				System.out.print(dan1+" x "+dan2+" = "+(dan1*dan2) + "\t");
				dan2++;
			}
			dan1++;
			dan2 = 1;
			System.out.println();
		}
		
		// System.out.println("$$$$$$$$$$$$$$$");
//		int dan2 = 3;
//		int i =1;
//		while(i<10) {
//			System.out.println(dan2+" x "+i+" = "+(dan*i));
//			i++;
//		}
	}

}
