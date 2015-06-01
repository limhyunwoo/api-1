package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO>{

	/*
	 * 이름으로 오름차순 정렬
	 * ㄱ, ㄴ, ㄷ, ...
	 * A, B, C, ...
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		
		
		return first.getName().compareTo(second.getName());
		/*
		 * 뒤에 파라미터에 있는 앞 글자와 비교해서 
		 * 앞 글자가 먼저 나오는 글자라면 그 글자부터 리턴해라.
		 */
	}

	
	
}
