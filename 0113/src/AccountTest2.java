import acc.Account;
import acc.SpecialAccount;

public class AccountTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Bank bank = new Bank();
		
		bank.makeAccount(new Account(101, "홍길동", 10000));
		bank.makeAccount(new SpecialAccount(102, "고길동", 2000000, "VIP"));
		bank.makeAccount(new SpecialAccount(102, "공길동", 20000, "Gold"));
		// printAllAccount();
		bank.printSpecialAccount("VIP");
		// bank.printAccount();
	}

}
