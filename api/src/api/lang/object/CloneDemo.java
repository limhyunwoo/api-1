package api.lang.object;

import java.util.Arrays;

/*
 * java.lang.Object�� �޼ҵ�
 * clone()�� ��ü�� �����Ѵ�.
 */
public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		// �迭�� �� �� ������ ������Ű�� �߰� �Ҵ��� ���� �ʴ´�.
		// �������� �Ҵ��ϰ��� �� ���� ArrayList�� ����Ѵ�.
		
		int[] arr2 = arr.clone();
		/* arr �迭�� ������ ���� arr2 �� �״�� �Ҵ��Ѵ�.*/
		
		for(int i=0; i<arr2.length; i++){
			// \t �� �̽������� ���ڷ� tab�� ���Ѵ�.
			System.out.print(arr2[i] + "\t"); 
		}
		
		System.out.println("==========================");
		System.out.println("Arrays�� ���");
		System.out.print("arr �� ��� ��� : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("arr2 �� ��� ��� : " + Arrays.toString(arr2));
		System.out.println();
	}
}

