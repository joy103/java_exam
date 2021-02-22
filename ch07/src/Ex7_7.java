
public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null; //null이어도 형변환에는 문제 없음
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
//		car.drive(); //NullPointerException 발생
		fe.water();
		car = (Car)fe; //자손->조상 으로 형변환
//		car.water(); //호출 불가
		fe2 = (FireEngine)car; //조상->자손 으로 형변환
		fe2.water();


	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}
