package api.lang.String;

/*
 * java.lang.String �� �ִ�
 * substring() �޼ҵ�� 
 * ������ġ(begin) ���� �� ��ġ(end) ���� ���ڿ� ����
 * begin <= x < end
 */

public class SubstringDemo {
	public static void main(String[] args) {
		// �ε����� 0���� �����ϸ� ���鵵 1�� ó���Ѵ�.
		System.out.println("�Ķ���Ͱ� �� ���� �� : " + "Hello Java".substring(6));
		// 6������ 7��° ������ J ���� 9��°�̸� ������ a
		// �׷��� Ja�� ����
		System.out.println("�Ķ���Ͱ� �� ���� �� : " + "Hello Java".substring(6, 8));
	}
}
