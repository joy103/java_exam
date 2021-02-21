
public class Ex7_4 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x="+p.x+", y="+p.y+", z="+p.z);

	}

}

class Point {
	int x,y;
	
	Point(int x, int y) {
//		super(); // 조상이 Object(), 모든 생성자는 첫줄에 다른 생성자를 호출 -> 그렇지 않으면 컴파일러가 자동으로 super()를 추가
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x,y); // Point(int x, int y)를 호출
		this.z=z;
	}
}
