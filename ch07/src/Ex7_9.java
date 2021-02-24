class Product2 {
	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스 점수
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
	
	Product2() {} // 기본생성자
}

class Tv2 extends Product2 {
	Tv2() {
		super(100); //조상클래스의 생성자 Product2(int price)를 호출, Tv 가격을 100만원으로
	}
	
	public String toString() {return "Tv";} //Object 클래스의 toString()을 오버라이딩
}

class Computer2 extends Product2 {
	Computer2() {super(200);}
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	Audio2() {super(50);}
	public String toString() {return "Audio";}
}

class Buyer2 { //고객, 물건을 사는 사람
	int money=1000; //소유금액
	int bonusPoint=0; //보너스점수
	Product2[] cart = new Product2[10]; //구입한 제품을 저장하기 위한 배열
	int i=0; //Product 배열에 사용될 카운터
	
	void buy (Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; //제품을 Product[] cart에 저장
		System.out.println(p+"을/를 구입하셨습니다."); //p는 p.toString()이랑 동일
	}
	
	void summary() { //구매한 물품에 대한 정보를 요약
		int sum = 0; //구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품목록
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		System.out.println("구입하신 물품의 총금액은 " +sum +"만원입니다.");
		System.out.println("구입하신 제품은 " +itemList +"입니다.");
	}
}


class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2()); //Product p = new Tv1(); b.buy(p); 와 같은 것 -> 대신 여기서는 참조변수가 없기 때문에 Tv1을 사용 불가
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}
