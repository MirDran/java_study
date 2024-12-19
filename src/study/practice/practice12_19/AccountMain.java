package study.practice.practice12_19;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		
		a1.setBalance(50000); //기본 자금
		
		System.out.println(a1.deposit(20000) +  "원 입급 했습니다."); //2만원 입금
		System.out.println("잔액 : " + a1.getBalnce() + "원");
		System.out.println();
		System.out.println(a1.withdraw(90000) +  "원 출금 했습니다.");; //1만원 출금
		System.out.println("잔액 : " + a1.getBalnce() + "원");
	}

}
