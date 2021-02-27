class Outer3 {
	int value = 10; //외부클래스의 iv -> Outer3.this.value
	
	class Inner {
		int value = 20; //내부클래스의 iv -> this.value
		
		void method1() {
			int value = 30; //lv
			System.out.println("value : "+value);
			System.out.println("this.value : "+this.value);
			System.out.println("Outer3.this.value : "+Outer3.this.value);
		}
	}
}



class Ex7_16 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
	}

}
