
class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner { 
		int iiv = outerIv; //외부클래스의 private 멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv; //static클래스는 외부클래스의 인스턴스멤버에 접근 불가
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0; //메서드 종료와 함께 소멸 (변수인데 값이 안바뀌는 것을 상수로 간주)
		final int LV = 0; //JDK1.8부터 final 생략 가능(변수인데 값이 안바뀌는 것을 상수로 간주)
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능 
			//내부 클래스의 객체가 lv보다 더 오래 존재할 수 있음-> 그러나 JDK1.8부터는 에러가 아님
			int liv4 = LV;
		}
	}
}
