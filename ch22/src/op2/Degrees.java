package op2;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도 => 섭씨온도
		// 화씨온다 입력받은 후 섭씨 온도로 변환하기
		// 섭씨온도 = (화씨온도 - 32) * 5/9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력하시오 : ");
		int tem = sc.nextInt();
		
		double tem2 = (tem-32) * 5 / 9.0;
		System.out.println("섭씨온도는 : " +tem2);
		// System.out.println("섭씨온도는 : %f" +tem2);
		// format 지정 : %f(실수형), %d(정수형), %c(문자-''), %s(문자열-"")
		System.out.println("프로그램 종료");
		sc.close();

	}

}
