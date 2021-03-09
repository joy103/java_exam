import java.text.*;

class Ex10_7 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89"); // 문자 -> 숫자
			System.out.print("1,234,567.89"+" -> ");
			
			double d = num.doubleValue(); //doubleValue()는 Number에 저장된 값을 double형의 값으로 변환하여 반환
			System.out.print(d+" -> ");
			
			System.out.println(df2.format(num)); // 숫자 -> 원하는 다른 형식
		} catch(Exception e) {}
	}
}
