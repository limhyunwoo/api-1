package api.lang.String;

/*
 java.lang.String
 length() : String 문자열의 길이를 구하는 메소드
 */

public class LengthDemo {
	public static void main(String[] args) {
		String tmp = "자바 API 학습";
		int len = tmp.length();
		char[] tmpCharArr = new char[len];
		char[] charArr = new char[len];
		
		for(int i=0; i<len; i++){
			tmpCharArr[i] = tmp.charAt(i);
		}
		
		// reverse
		for(int j=0; j<len; j++){
			charArr[j] = tmpCharArr[len -1 - j];
		}
		
		String reverseTmp = new String(charArr);
		System.out.println(reverseTmp);
	}
}
