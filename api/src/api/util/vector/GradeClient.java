package api.util.vector;

import java.util.Vector;

public class GradeClient {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		vo1.setHak("201113002");
		vo1.setName("ȫ�浿");
		vo1.setKor(87);
		vo1.setEng(85);
		vo1.setMath(70);
		
		GradeVO vo2 = new GradeVO();
		vo2.setHak("201106030");
		vo2.setName("��������");
		vo2.setKor(90);
		vo2.setEng(93);
		vo2.setMath(97);
		
		GradeVO vo3 = new GradeVO();
		vo3.setHak("201102021");
		vo3.setName("ȫ�浿");
		vo3.setKor(60);
		vo3.setEng(60);
		vo3.setMath(60);
		

		GradeService gradeService = new GradeServiceImpl();
		gradeService.input(vo1);
		gradeService.input(vo2);
		gradeService.input(vo3);
		
		String gradeOfStudent = gradeService.searchGradeByHak("201113002");
		System.out.println("201113002 �й��� ����ǥ : " + gradeOfStudent);
		
		Vector<String> gradesOfCoupleOfStudents = gradeService.searchGradeByName("ȫ�浿");
		System.out.println("=== �̸��� ȫ�浿�� �л����� ����ǥ ===");
		for(String s : gradesOfCoupleOfStudents){
			System.out.println(s);
		}
		
		System.out.println("======== ���� �ȵ� ����ǥ ����Ʈ ============");
		gradeService.print();
		
		System.out.println("======== �������� ���ĵ� ����ǥ ����Ʈ ============");
		gradeService.ascGradeTotal();
		gradeService.print();
		
		
		System.out.println("======== �������� ���ĵ� ����ǥ ����Ʈ ============");
		gradeService.descGradeTotal();
		gradeService.print();
		
		
		
	}
}
