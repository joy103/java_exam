class Product {
	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100); //조상클래스의 생성자 Product(int price)를 호출, Tv 가격을 100만원으로
	}
	
	public String toString() {return "Tv";} //Object 클래스의 toString()을 오버라이딩
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Buyer { //고객, 물건을 사는 사람
	int money=1000; //소유금액
	int bonusPoint=0; //보너스점수
	
	void buy (Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다."); //p는 p.toString()이랑 동일
	}
}


class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); //Product p = new Tv1(); b.buy(p); 와 같은 것 -> 대신 여기서는 참조변수가 없기 때문에 Tv1을 사용 불가
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}
