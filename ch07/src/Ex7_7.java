
public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null; //null�̾ ����ȯ���� ���� ����
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
//		car.drive(); //NullPointerException �߻�
		fe.water();
		car = (Car)fe; //�ڼ�->���� ���� ����ȯ
//		car.water(); //ȣ�� �Ұ�
		fe2 = (FireEngine)car; //����->�ڼ� ���� ����ȯ
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
