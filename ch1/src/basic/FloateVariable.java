package basic;

public class FloateVariable {
	
	// 실수 => 3.14
	//       부동 소수점 방식(가수부분 + 지수부분)
	// 실수형 	: 1. float(4byte) : 부호비트 1, 지수부 8, 가수부 23(합 32비트)
	//      : 2. double(8byte)-기본 : 부호 1, 지수부 11, 가수부 52
	
	
	
	public static void main(String[] args) {
		// float f1 = 90.17; 
		// Type mismatch: cannot convert from double to float
		// 더블을 float에 담을수 없음
		// F,f를 입력해주자
		float f1 = 90.17F;
		System.out.println("f1 = "+f1);
	}

}
