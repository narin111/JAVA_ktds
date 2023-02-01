import java.util.Iterator;

import acc.Account;
import acc.SpecialAccount;

public class Bank {

	static Account[] accs = new Account[100];
	static int count = 0;
	
	void makeAccount(Account acc) {
		accs[count++] = acc;	
	}
	
	void printAllAccount() {
		for(int i=0; i<count; i++) {
			System.out.println(accs[i].info());
		}		
	}
	
	void printSpecialAccount() {
		for(int i=0; i<count; i++) {
			if(accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	void printSpecialAccount(String grade) {
		for(int i=0; i<count; i++) {
			// down casting: grade는 자식거
			if(accs[i] instanceof SpecialAccount) {
				SpecialAccount sacc = (SpecialAccount)accs[i];
				if(sacc.getGrade().equals(grade)) {
					System.out.println(accs[i].info());
				}				
					
			}
		}
	}
	
	void printAccount() {
		
//		Iterator<Account> it = accs.iterator();
//		while(it.hasNext()) {
//			Account acc = it.next();
//			if(!(acc instanceof SpecialAccount)) {
//				System.out.println(acc.info());
//			}
//		}
	}
	

}
