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
		ascGradeTotal();
		Collections.reverse(grades);
	}
	
	// Collections.sort()�� comparator ������
	private Comparator<GradeVO> getAnonymousComparator(final boolean asc){
		return new Comparator<GradeVO>() {
			@Override
			public int compare(GradeVO vo1, GradeVO vo2) {
				
				int result = (asc)? 1 : -1;
				
				if(vo1.getTotal() > vo2.getTotal())
					return result;
					
				return 0;
			}
		};
	}

	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void ascGradeTotal() {
		/*Collections.sort(
				grades, 
				//getAnonymousComparator(true)
		);*/
		
		Collections.sort(
				grades, 
				//getAnonymousComparator(false)
				
				new Comparator<GradeVO>() {
					@Override
					public int compare(GradeVO vo1, GradeVO vo2) {
						if(vo1.getTotal() < vo2.getTotal())
							return -1;
						else if(vo1.getTotal() > vo2.getTotal())
							return 1;
						else
							return 0;
					}
				}
		);
	}

	
}
