class Person {
	long id; //this.id
	
	//주소값이 아닌 멤버변수 id값을 비교하도록 하기위해 오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) 
			return false; // 타입이 Person이 아니면 값을 비교할 필요 없음
		
		Person p = (Person)obj; //obj가 Object타입으로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요
		return this.id==p.id;
	}
	
	Person(long id) {
		this.id = id;
	}
}


class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(1234567890);
		Person p2 = new Person(1234567890);
		
		
		if (p1.equals(p2)) 
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다."); //서로 다른 두 객체는 항상 주소가 다름
	}

}


