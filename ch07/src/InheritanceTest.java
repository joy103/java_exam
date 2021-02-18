class MyPoint {
	int x;
	int y;
}

class Circle extends MyPoint { //상속
	int r;
}

class Circle2 { //포함
	MyPoint p = new MyPoint();
	int r;
}




public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.x=1;
		c.y=2;
		c.r=3;
		System.out.println("c.x="+c.x);
		System.out.println("c.y="+c.y);
		System.out.println("c.r="+c.r);
		
		Circle2 c2 = new Circle2();
		c2.p.x=10;
		c2.p.y=20;
		c2.r=30;
		System.out.println("c2.p.x="+c2.p.x);
		System.out.println("c2.p.y="+c2.p.y);
		System.out.println("c2.r="+c2.r);
		
	}

}
