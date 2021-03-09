import java.util.*;
import java.text.*;

class Ex10_9 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try { //지정된 형식과 입력된 형식이 일치하지 않는 경우에는 예외가 발생 -> 적절한 예외처리 필요
			Date d = df.parse("2019년 11월 23일"); // 문자 -> 날짜
			System.out.println(df2.format(d)); // 날짜 -> 원하는 형식의 문자
		} catch(Exception e) {}

	}

}
