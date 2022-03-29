package emp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 접근하고자 하는 테이블의 필드와 동일하게 생성
// exam_emp
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//@ToString

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}





