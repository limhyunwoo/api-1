package api.util.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator(list.size());
		// listIterator 파라미터 
		/*
		 * Java API 를 보니
		 * java.util.List 페이지에서 listIterator 를 보니
		 * listIterator()
		 * listIterator(int index)
		 * 두 가지 형태가 있는데...
		 * 파라미터가 없는 것은 순방향을 한 번 돌려야 역방향
		 * 출력이 되고, 파라미터(list.size)가 있으면 이 파라미터가 인덱스 역할을 해서 바로 역방향으로 출력된다.
		 * 따라서, 파라미터가 있는 형태를 추천함.
		 */
		System.out.println("역방향 출력");
		/*
		 * 이클립스 제안으로 자동 생성시키면
		 * 아래 조건식에 it.hasNext()가 생성된다.
		 * 역순 출력을 위해서는 hasPrevious() 라고 바꿔준다.
		 */
		
		while (it.hasPrevious()) {
			// 아래 메소드도 previous() 바뀌는 것에  주의 !!
			System.out.println(it.previous() + "\t");
			
		}
	}
}
