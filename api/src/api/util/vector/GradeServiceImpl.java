package api.util.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		grades.addElement(vo);
	}
	
	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����.
	 */
	@Override
	public void print() {
		for(GradeVO vo : grades){
			System.out.println(vo.toString());
		}
	}

	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ� // ������ �����ϴ�..
	 */
	@Override
	public String searchGradeByHak(String hak) {
		for(int i=0; i<grades.size(); i++){
			GradeVO vo = grades.elementAt(i);
			if(vo.getHak().equals(hak))
				return vo.toString();
		}
		
		return null;
	}
	
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> gradesOfThatNames = new Vector<String>();
		
		for(int i=0; i<grades.size(); i++){
			GradeVO vo = grades.elementAt(i);
			if(vo.getName().equals(name))
				gradesOfThatNames.addElement(vo.toString());
		}
		
		return gradesOfThatNames;
	}

	
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void descGradeTotal() {
		Collections.sort(grades, getAnonymousComparator(false));
	}
	
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void ascGradeTotal() {
		Collections.sort(grades, getAnonymousComparator(true));
	}
	
	// Collections.sort()�� �Ķ������ comparator �ݹ� ������
	private Comparator<GradeVO> getAnonymousComparator(final boolean asc){
		return new Comparator<GradeVO>() {
			@Override
			public int compare(GradeVO vo1, GradeVO vo2) {
				// ��ȯ�� : ����(ù ��° ���� ������), 0(�� �񱳰��� ������), ���(ù ��° ���� ũ��)
				
				int result = (asc)? 1 : -1;
				
				if(vo1.getTotal() > vo2.getTotal())
					// ���������� ���, ���� �� ù ��° ���� �� ũ�� 1�� �༭ �����ȣ�� ���ø��� ����
					// ���������� ���, ���� �� ù ��° ���� �� ũ�� -1�� �༭ ������ ���ϰڴٴ� ��ȣ�� ����
					return result; 
				
				else if(vo1.getTotal() < vo2.getTotal())
					// ���������� ���, ���� �� ù ��° ���� ������ -1�� �༭ ������ ���ϰڴٴ� ��ȣ�� ���ø��� ����
					// ���������� ���, ���� �� ù ��° ���� ������ 1�� �༭ �����ȣ�� ���ø��� ����
					return result * -1; 
				
					
				return 0; 
			}
		};
	}

	
}
