
class Ex7_12 {
	class InstanceInner { //인스턴스 내부클래스
		int iv = 100;
//		ststic int cv = 100; //static 변수를 선언할 수 없음
		final static int CONST = 100; //final static은 상수이므로 허용
	}
	
	static class StaticInner { // static 내부클래스
		int iv = 200;
		static int cv = 200; //static클래스만 static멤버를 정의할 수 있음
	}
	
	void myMethod() {
		class LocalInner { //지역 내부클래스
			int iv = 300;
//			static int cv = 300; //static 변수를 선언할 수 없음
			final static int CONST = 300; //final static은 상수이므로 허용
		}
		
		int i = LocalInner.CONST; //OK
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); // 지역내부클래스는 메서드내에서만 사용 가능

	}

}
