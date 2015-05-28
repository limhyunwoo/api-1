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
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 */
	@Override
	public void print() {
		for(GradeVO vo : grades){
			System.out.println(vo.toString());
		}
	}

	/*
	 * 학번으로 검색하는 기능을 가진 메소드 // 성적을 리턴하는..
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
	 * 이름으로 성적을 검색해서 출력하는 메소드
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
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void descGradeTotal() {
		ascGradeTotal();
		Collections.reverse(grades);
	}
	
	// Collections.sort()의 comparator 제조기
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
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
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
