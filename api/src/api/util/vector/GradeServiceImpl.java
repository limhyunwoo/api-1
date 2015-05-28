package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	
	@Override
	public void input(GradeVO vo) {
		
	}
	
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 */
	@Override
	public void print() {
		
	}

	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 */
	@Override
	public String searchGradeByHak(String hak) {
		return null;
	}
	
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		return null;
	}

	
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void descGradeTotal() {
		
	}

	/*
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
	 */
	@Override
	public void ascGradeTotal() {
		
	}

	
}
