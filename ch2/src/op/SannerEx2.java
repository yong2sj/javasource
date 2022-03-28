package op;

import java.util.Scanner;

public class SannerEx2 {

	public static void main(String[] args) {
		//사용자로부터 한달 월급을 입력받은 후
		Scanner sc = new Scanner(System.in);
		System.out.println("한달 월급 입력 : ");
		int salary = sc.nextInt();
		
		//한달 월급을 
		System.out.println("한달 월급 = "+salary);
		
		sc.close();
		

	}

}
