package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2011", "ȫ�浿", 90, 80, 70);
		GradeVO g2 = new GradeVO("2012", "��浿", 20, 20, 20);
		GradeVO g3 = new GradeVO("2013", "��浿", 60, 60, 60);
		GradeVO g4 = new GradeVO("2014", "���浿", 99, 99, 99);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		
		/*
		 * anonymous ������ ó�� : �� �ѹ��� ���� �����ڴ�.
		 */
		
		System.out.println("���� �������� ����");
//		Collections.sort(grades, new NameAscCompareImpl());
//		Collections.sort(grades, new NameDescCompareImpl());
//		Collections.sort(grades, new TotalAscCompareImpl());
		Collections.sort(grades, new TotalDescCompareImpl());
		
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
	}
}
