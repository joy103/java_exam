import java.util.Objects;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE",1); //Card(String kind, int number)호출
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//Object클래스의 toString()을 오버라이딩 -> 하기전에는 결과가 주소값으로 나옴
	public String toString() {
		return "kind : " + kind + ", number : " + number; //Card2인스턴스의 kind와 number를 문자열로 반환
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card2)) 
			return false;
		
		Card2 c = (Card2)obj;
		return this.kind.equals(c.kind) && this.number==c.number; //kind가 string이기 때문에 equals로 비교
	}
	
	//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함
	public int hashCode() {
		return Objects.hash(kind,number);
	}
}

class Ex9_5 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}

}
