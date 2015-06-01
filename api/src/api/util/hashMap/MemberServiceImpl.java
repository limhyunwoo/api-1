package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;


public class MemberServiceImpl implements MemberService{

	Map<String, Object> map = new HashMap<String, Object>();
	
//	MemberVO vo = new MemberVO();
	
	/*
	 * ȸ������ ����� �ϴ� �޼ҵ�
	 * HashMap�� �ؾ�  id���� ������  password�� ȣ���ϰڱ���..
	 * 
	 */
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		
		/*
		 * �� ������ DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�.
		 * ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡
		 * ���� ���� �������� DB�� �����ϰ� ����.
		 */
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		
		/*
		 * 1. ù ��° ���� ����
		 * map.put(vo.getId(), vo.getPassword())
		 */
		
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// Ű�� ��� ���Ͽ��� ������� String���� ���Ͻ�Ű����
		// int Ÿ������ ���� age�� String Ÿ������ ��ȯ�Ͽ���.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
		/*
		 * 2. �� ��° ���� ����
		 * map.put("age", vo.getAge());
		 */
	}

	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ�
	 * ���ٸ� ���� �����ϱ�..
	 * �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	 */
	
	
	
	/*
	 * ��¹� ����
	 * (1) �Է��Ͻ� ID�� �������� �ʰų� ��ġ���� �ʽ��ϴ�.
	 * (2) ����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.
	 * (3) ȯ���մϴ�. ����ÿ� ��� 20�� ȫ�浿�� ..
	 */
	@Override
	public void login(String id, String password) {
		/*
		 * 3. �� ��° ���� ����
		 * map.get(id) => �Ķ���� ������ �ݵ�� String���� �ؾ� ��.
		 */
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("ȯ���մϴ�. " + map.get("addr") + "�� ��� " + map.get("age") + "�� " + map.get("name") + "�� ..");
		}else if( !(map.get("id").equals(id)) && map.get("password").equals(password) ){
			System.out.println("�Է��Ͻ� ID�� �������� �ʰų� ��ġ���� �ʽ��ϴ�.");
		}else{
			System.out.println("����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.");
		}
			
	}

}
