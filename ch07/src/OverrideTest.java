class MyPoint3 extends Object{
	int x;
	int y;
	
	String getLocation() {
		return "x:"+x+", y="+y;
	}
	
	public String toString() { //object Ŭ������ toString()�� �������̵�
		return "x:"+x+", y="+y;
	}
	
}

class MyPoint3D extends MyPoint3 {
	int z;
	
	//������ getLocation()�� �������̵�
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
		p1.x=1; //����� new MyPoint3(1,2)�� �ϰ� �����ڸ� ������ ���� ���
		p1.y=2;
		System.out.println(p1.toString());
		System.out.println(p1);
		
	}

}
