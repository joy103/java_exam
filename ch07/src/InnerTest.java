class AAA { //AAA는 DDD의 외부클래스
	int i;
	BBB b = new BBB();
	
	class DDD { //DDD는 AAA의 내부클래스 (DDD는 AAA안에서만 쓰인다는 가정)
		void method() {
//			AAA a = new AAA(); 
//			System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부 클래스의 멤버 접근 가능 
			
		}
	}
}

class BBB {
	void method() {
		AAA a = new AAA(); //BBB에서 AAA를 사용하려면 객체를 생성해줘야 함
		System.out.println(a.i);
	}
}

class CCC {
	BBB b = new BBB();
//	DDD d = new DDD(); //CCC는 DDD에 접근 불가
}


public class InnerTest {

	public static void main(String[] args) {
		BBB b = new BBB();
		b.method();
	}

}
