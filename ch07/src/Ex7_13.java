
class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner(); //인스턴스 멤버간에는 서로 직접 접근이 가능
	static StaticInner cv = new StaticInner(); // static 멤버간에는 서로 직접 접근이 가능
	
	static void staticMethod() { 
//		InstanceInner obj1 = new InstanceInner(); //static멤버는 인스턴스 멤버에 직접 접근이 불가
		StaticInner obj2 = new StaticInner();
		
		Ex7_13 outer = new Ex7_13(); //굳이 접근하려면 객체를 생성해야함 
		InstanceInner obj1 = outer.new InstanceInner(); //인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성 가능
	}
	
	void instanceMethod() { //인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner(); 
		StaticInner Obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); //메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근 불가
	}
	
	void method() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}

}