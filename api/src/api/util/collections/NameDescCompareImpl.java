package api.util.collections;

import java.util.Comparator;

public class NameDescCompareImpl implements Comparator<GradeVO>{

	/*
	 * 이름으로 내림차순 정렬
	 */
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
		return second.getName().compareTo(first.getName());
	}

	
}
