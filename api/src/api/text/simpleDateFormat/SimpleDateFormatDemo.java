package api.text.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		// 이클립스 제안 중 java.util.Date 가 있고
		// java.sql.Date 가 있는데 앞에 것을 취한다.
		Date today = new Date();
		
		SimpleDateFormat date01, date02, date03, date04;
		date01 = new SimpleDateFormat("yyyy-MM-dd"); // 월은 대문자 MM
		date02 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 분은 소문자 mm
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a"); //a = 오전 오후
		
		System.out.println(date01.format(today));
		System.out.println(date02.format(today));
		System.out.println(date03.format(today));
		System.out.println(date04.format(today));
		
	}
}
