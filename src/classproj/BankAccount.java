package classproj;

public class BankAccount {
	
	// Field
	String no;			// 계좌번호
	long   balance;		// 잔액
	
	// Constructor
	BankAccount(String no, long balance){
		this.no      = no;
		this.balance = balance;
	}
	
	// Method
	/*
	 * 1. 입금(마이너스 불가)
	 * 2. 출금(잔액보다 큰 출금 불가)
	 * 3. 이체
	 * 4. 조회
	 */
	
	// 입금
	void deposit(long money) {
		if (money < 0) {
			return;			// 예외 처리
		}
		balance += money;
	}
	
	// 출금
	void withdraw(long money) {
		if (money > balance) {
			return;
		}
		balance -= money;
	}
	
	// 이체
	void transfer(BankAccount acc, long money) {	// acc계좌에 돈보냄
		if (money > balance) {	// break 걸어주지않으면 내계좌에서 나가지는 않으나 가상의 돈이 생겨 입금처리가 되어버림.
			return;
		}
		withdraw(money);
		acc.deposit(money);
		System.out.println(acc.no+"로 "+money+"를 이체하셨습니다.");
		System.out.println("고객님"+this.no+"의 남은 잔액은 "+this.balance+"입니다.");
	}
	
	// 조회
	void inquiry() {
		System.out.println("계좌 번호 : "+no);
		System.out.println("계좌 잔액 : "+balance);
	}

}
