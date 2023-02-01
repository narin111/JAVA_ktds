interface IClick{
	void click();
}

class MyButton{
	IClick iclick;
	void onClick() {
		System.out.println("눌림");
		if(iclick != null) {
			iclick.click();
		}
	}
	void addClickListener(IClick click) {
		this.iclick = iclick;
	}
	
}
public class AnonyClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton loginBtn = new MyButton();
		loginBtn.addClickListener(new IClick(){
			@Override
			public void click() {
				System.out.println("로그인처리");
			}
		});
	}

}
