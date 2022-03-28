package classtest;

public class StudentNEx {

	public static void main(String[] args) {
		// main함수가 있어야 화면출력이 가능하다
		// 클래스 : 개체의 속성과 기능을 코드로 구현
		// 위 클래스를 사용하는 것을 객체 생성, 실행한다 표현
		// Student 클래스는 사용해보자.
		// 클래스명 변수명 = new 클래스명(); < 생성
		Student student = new Student(); // heap 안에 생성
		// 초기화 작업
		student.studentId = 20201010;
		student.studentName = "홍길동";
		student.address = "서울시 구로구";
		student.mobile = "010-1234-5678";
		// 메소드 실행
		student.changeAddress();
		
	
		Student student2 = new Student();
		// 초기화 작업
		student.studentId = 20201011;
		student.studentName = "이용희";
		student.address = "서울시 은평구";
		student.mobile = "010-3333-4444";
		System.out.println("학생 : "+student2);
		
		
	}

}
