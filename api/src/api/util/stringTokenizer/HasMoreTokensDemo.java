package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	public static void main(String[] args) {
		/*
		 * ������ Ȥ�� ���� ��� ������ token �̶�� �ϴµ�
		 * Ư�� �����ڸ� �����ϸ� �װ��� ��������
		 * �߶󳻴� Ŭ���� �� �޼ҵ�
		 */
		String date = "2015/05/24";
		StringTokenizer stringTokenizer = new StringTokenizer(date, "/");
		/*
		 * �� ������ �Ķ���� �� �տ� ���� String eotkd rorcp,
		 * �ڿ� ���� ������
		 */
		int idx = 0;
		/*
		 * whi ġ�� �� ��Ŭ���� ���� �߿��� with enumeration
		 * ���� ���� �� ����..
		 * �׸����� hasMoreElements() ����
		 * hasMoreTokens() �θ� ���� 
		 */
		while (stringTokenizer.hasMoreElements()) {
			String token = stringTokenizer.nextToken();
			System.out.println("[" + idx + "] : " + token);
			idx++;
		}
		
	}
}
