package api.lang.object;

public class EqaulsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1 == p2)? "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람";
		System.out.println("(p1 == p2)에 대한 결과값 : " + result);
		
		
		result = (p1.equals(p2))? "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람";
		System.out.println("(p1.equals(p2))에 대한 결과값 : " + result);
		
	}
}

class Person{
	private String ssn; // 주민번호
	
	public Person(String ssn) {
		this.ssn = ssn;
	}
	// Alt + Shift + s
	// Generate getter setter

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Alt + Shift + s
	// generate hashCode() and equals()
	@Override
	public boolean equals(Object obj) {
		/*
		 * Object는 모든 데이터 타입을 의미하기 때문에
		 * 반드시 주민번호를 갖고 있는 Person 인지를
		 * 확인해야 주민번호 일치여부를 따질 수 있기 때문에
		 * 객체캐스팅 연산자 instanceof 를 사용한다.
		 * 이런 기능을 validation 유효성 체크라고 한다.
		 */
		
		
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
			
			// java.lang.Object 의 객체 캐스팅은
			// ((객체타입)obj)...의 형태로 이뤄진다.
		}else{
			return false;
		}
	}
	
	
	
	
}


