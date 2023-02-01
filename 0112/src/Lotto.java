
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		for(int i=1; i<=45; i++) {
			ball[i-1] = i;
		}
		for(int i=0; i<1000; i++) {
			int idx1 = (int)(Math.random()*45);
			int idx2 = (int)(Math.random()*45);
			if(idx1 != idx2) {
				int tmp = ball[idx1];
				ball[idx1] = ball[idx2];
				ball[idx2] = tmp;
			}
		}
		
		
		for(int i=0; i<6; i++) {
			System.out.println(ball[i]+"\t");
		}
	}
	

}
