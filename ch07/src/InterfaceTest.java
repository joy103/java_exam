class A {
	public void method(I i) { //인터페이스 I를 구현한 것들만 매개변수로 가능
		i.method();
	}
}

//B클래스의 선언과 구현을 분리
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); //A가 B를 사용(의존) -> B가 인터페이스를 구현했기 때문에 가능
		a.method(new C()); //A가 C를 사용(의존) -> C가 인터페이스를 구현했기 때문에 가능

	}

}
