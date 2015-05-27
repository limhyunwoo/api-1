package api.lang.String;
/*
 * java.lang.String 메소드
 * replace("OLD", "NEW") : String 문자열에서 "OLD" 글자를
 * "NEW" 글자로 대체한다.
 * 만약, 대체하는 글자가 복수이면 replaceAll()을 사용한다.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll("C D", "E F"));
	}
}
