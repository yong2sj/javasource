package op2;

public class LogicalOperatorEx20 {

	public static void main(String[] args) {
		
		int charCode = 'A';
//		System.out.println(charCode);
//		
//		char char1 = 'A';
//		System.out.println(char1);
		
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("대문자");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("대문자");
		}
		
		

	}

}
