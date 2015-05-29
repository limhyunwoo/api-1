package api.util.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * java.util.HashSet �� �޼ҵ���
 * add() �� ����ó�� ����� �߰� ����� �Ѵ�.
 */
/*
 * Set�� ��ü�� �߰��� �� HashSet�� �̹� �ִ� ��ü���
 * �ߺ����� �����ϰ� �������� �ʴ´�.
 * �׸��� false�� �����Ѵ�.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "3", "3", "4"};
		// ��Ŭ���� ���� ��  java.util.Set �߰�
		Set set = new HashSet();
		for(int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("������ ��� : " + set);
		/*
		 * ������ ��� : [3, 2, 1, 4] �̷��� ��µǴµ�,
		 * �̰ɷ� ���� new Integer(2)  �� "2"��
		 * ���� �ٸ� ��ü�̹Ƿ� �ߺ����� �������� �ʴ´ٴ� ����
		 * �� �� �ִ�.
		 */
	}
}