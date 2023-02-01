package acc;

public class SpecialAccount extends Account{
	String grade;
	double rate;
	
	public SpecialAccount(int num, String name, int balance, String grade) {
//		this.num = num;
//		this.name = name;
//		this.balance = balance;
		// super // 부모의 생성자를 통해서 초기화 시켜줌 
		super(num, name, balance);
		setGrade(grade);
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch(this.grade) {
		case "VIP" : 
			rate = 0.04; break;
		case "Gold" : 
			rate = 0.03; break;
		case "Silver" : 
			rate = 0.02; break;
		case "Normal" : 
			rate = 0.01; break;
		}
	}

	@Override
	public String info() {
		return super.info()+", 등급:"+grade;
	}
	
	
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money+(int)(money*rate));
	}
	
}
