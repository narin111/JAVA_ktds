class Button{
	void onClick() {
		System.out.println("버튼눌림");
	}
}
public class AnonyClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button lb = new Button() {
			@Override
			void onClick() {
				super.onClick();
				System.out.println("로그인처리");
			}
		};
		lb.onClick();
		Button jb = new Button() {
			void onClick() {
				super.onClick();
				System.out.println("회원가입처리");
			}
		};
		jb.onClick();
	}

}
