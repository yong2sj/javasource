package exception;

public class AccoungEx {

	public AccoungEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Account account = new Account("111", "홍길동", 200000);
		
//		직접 exception 을 만들어서 쓸 수도 있고 맨 밑처럼 기존에 있는 exception을 사용해도 된다
//		try {
//			account.withdraw(300000);
//		} catch (BalanceInsufficientException e) {
//			e.printStackTrace();
//		}
		
		try {
			account.withdraw(300000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
