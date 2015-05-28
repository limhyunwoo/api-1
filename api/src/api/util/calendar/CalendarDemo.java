package api.util.calendar;

import java.util.Calendar;

/*
 * java.util.Calendar
 */
public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {
			"1월", "2월", "3월", "4월", "5월", "6월", 
			"7월", "8월", "9월", "10월", "11월", "12월"};
		
		// Calendar.getInstance()은 내부적으로
		// 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		// 여러 개의 인스턴스를 생성하지 않도록 방지하려는
		// 목적에서 코딩되었다.
		Calendar date = Calendar.getInstance();
		
		System.out.print("날짜 : ");
		System.out.print(date.get(Calendar.YEAR) + "년");
		System.out.print(date.get(Calendar.MONTH) + "월");
		System.out.print(date.get(Calendar.DATE) + "일");
		
		System.out.println();

		System.out.print("시간 : ");
		System.out.print(date.get(Calendar.HOUR) + "시");
		System.out.print(date.get(Calendar.MINUTE) + "분");
		System.out.print(date.get(Calendar.SECOND) + "초");
		System.out.println();
		
		System.out.println("=== 계산은 1달 후 지만 결과값은 현재의 달 ===");
		date.add(Calendar.MONTH, 1);
		System.out.println("현재의 달 " + toString(date));

		/*
		 * 출력된 결과값 : java.util.GregorianCalendar
		 * 오버라이딩이 필요하다. 
		 */
		
		System.out.println("=== 7일 전 ===");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));

		/*
		 * 출력된 결과값 : java.util.GregorianCalendar
		 * 오버라이딩이 필요하다. 
		 */
		
		System.out.println("특정 날짜로 세팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("수정된 시간 출력");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		/*
		 * 수정된 시간 출력결과값이 101213 처럼 되어 오버라이딩이 필요하다.
		 */
		
		
		
		
	}
	
	public static String toString(Calendar date){
		StringBuffer str = new StringBuffer();
		str.append(date.get(Calendar.YEAR) + "년");
		str.append((date.get(Calendar.MONTH)+1) + "월"); // 월은 0부터 시작하므로 +1을 해야 한다.
		str.append(date.get(Calendar.DATE) + "일");
		
		
		return str.toString();
	}
	
}
