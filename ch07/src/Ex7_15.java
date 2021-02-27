class Outer2 {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}


class Ex7_15 {

	public static void main(String[] args) {
		Outer2 oc = new Outer2(); //인스턴스 클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스를 먼저 생생성해야 함
		Outer2.InstanceInner ii = oc.new InstanceInner(); //내부클래스의 객체 생성
		
		System.out.println("ii.iv : "+ii.iv);
		System.out.println("Outer2.StaticInner : "+Outer2.StaticInner.cv); //static내부클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 됨
		
		//static내부클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 됨 
		Outer2.StaticInner si = new Outer2.StaticInner(); 
		System.out.println("si.iv : "+si.iv);

	}

}
