class Product {
	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ ���Ž� �����ϴ� ���ʽ� ����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //���ʽ� ������ ��ǰ������ 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100); //����Ŭ������ ������ Product(int price)�� ȣ��, Tv ������ 100��������
	}
	
	public String toString() {return "Tv";} //Object Ŭ������ toString()�� �������̵�
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Buyer { //��, ������ ��� ���
	int money=1000; //�����ݾ�
	int bonusPoint=0; //���ʽ�����
	
	void buy (Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�."); //p�� p.toString()�̶� ����
	}
}


class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); //Product p = new Tv1(); b.buy(p); �� ���� �� -> ��� ���⼭�� ���������� ���� ������ Tv1�� ��� �Ұ�
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}

}
