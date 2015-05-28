package api.util.vector;

import java.util.Vector;

public class GradeClient {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		vo1.setHak("201113002");
		vo1.setName("홍길동");
		vo1.setKor(87);
		vo1.setEng(85);
		vo1.setMath(70);
		
		GradeVO vo2 = new GradeVO();
		vo2.setHak("201106030");
		vo2.setName("광개토대왕");
		vo2.setKor(90);
		vo2.setEng(93);
		vo2.setMath(97);
		
		GradeVO vo3 = new GradeVO();
		vo3.setHak("201102021");
		vo3.setName("홍길동");
		vo3.setKor(60);
		vo3.setEng(60);
		vo3.setMath(60);
		

		GradeService gradeService = new GradeServiceImpl();
		gradeService.input(vo1);
		gradeService.input(vo2);
		gradeService.input(vo3);
		
		String gradeOfStudent = gradeService.searchGradeByHak("201113002");
		System.out.println("201113002 학번의 성적표 : " + gradeOfStudent);
		
		Vector<String> gradesOfCoupleOfStudents = gradeService.searchGradeByName("홍길동");
		System.out.println("=== 이름이 홍길동인 학생들의 성적표 ===");
		for(String s : gradesOfCoupleOfStudents){
			System.out.println(s);
		}
		
		System.out.println("======== 정렬 안된 성적표 리스트 ============");
		gradeService.print();
		
		System.out.println("======== 오름차순 정렬된 성적표 리스트 ============");
		gradeService.ascGradeTotal();
		gradeService.print();
		
		
		System.out.println("======== 내림차순 정렬된 성적표 리스트 ============");
		gradeService.descGradeTotal();
		gradeService.print();
		
		
		
	}
}
