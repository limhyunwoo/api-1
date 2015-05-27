package api.lang.String;

/*
 * java.lang.String
 * endWith(s) : s로 끝나는 지 여부 체크
 */

public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
			("Hello.txt".endsWith("txt"))? "txt파일 입니다." : "txt 파일이 아닙니다." 
		);
	}
}
