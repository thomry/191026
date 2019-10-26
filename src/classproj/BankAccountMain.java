package classproj;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount myAccount  = new BankAccount("1002-123-123456", 50000);
		BankAccount friAccount = new BankAccount("1002-123-234567", 60000);
		
		myAccount.transfer(friAccount, 20000);
		
		myAccount.inquiry();
		friAccount.inquiry();
		
		// 넘기기
		// 잔액을 넘겨서 이체가 되지않음
		myAccount.transfer(friAccount, 70000);
		myAccount.inquiry();
		friAccount.inquiry();
	}

}
