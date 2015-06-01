package api.util.collections;

import java.util.Comparator;

public class TotalAscCompareImpl implements Comparator<GradeVO>{
	
	/*
	 * 총점 오름차순... 숫자 값 오른차순
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return (first.getTotal() < second.getTotal()) ? -1 
				: (first.getTotal() > second.getTotal())? 1 : 0;
	}
}
