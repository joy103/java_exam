class MyPoint3 extends Object{
	int x;
	int y;
	
	String getLocation() {
		return "x:"+x+", y="+y;
	}
	
	public String toString() { //object 클래스의 toString()을 오버라이딩
		return "x:"+x+", y="+y;
	}
	
}

class MyPoint3D extends MyPoint3 {
	int z;
	
	//조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:"+x+", y="+y+", z:"+z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x=3;
		p.y=5;
		p.z=7;
		System.out.println(p.getLocation());
		
		MyPoint3 p1 = new MyPoint3();
		p1.x=1; //지우고 new MyPoint3(1,2)로 하고 생성자를 넣으면 같은 결과
		p1.y=2;
		System.out.println(p1.toString());
		System.out.println(p1);
		
	}

}
