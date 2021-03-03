import java.util.Objects;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE",1); //Card(String kind, int number)ȣ��
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//ObjectŬ������ toString()�� �������̵� -> �ϱ������� ����� �ּҰ����� ����
	public String toString() {
		return "kind : " + kind + ", number : " + number; //Card2�ν��Ͻ��� kind�� number�� ���ڿ��� ��ȯ
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card2)) 
			return false;
		
		Card2 c = (Card2)obj;
		return this.kind.equals(c.kind) && this.number==c.number; //kind�� string�̱� ������ equals�� ��
	}
	
	//equals()�� �������̵��ϸ� hashCode()�� �������̵� �ؾ���
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
