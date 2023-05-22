package s0522;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("미켈란젤로",0000,100);
		a.printInfo();
		a.입금(1000);
		a.입금(2000);
		a.출금(1000);
		a.출금(3000);
	}

}
