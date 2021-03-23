import java.util.*;

class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc"); //HashSet의 add메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해
		set.add("abc"); // 추가하려는 요소의 equals()와 hashCode()를 호출 -> 오버라이딩 필요
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}
}

class Person { //(extends object)
	String name;
	int age;
	
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {return name+":"+age;}

	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false; //형변환전 체크
		Person p = (Person)obj; //형변환
		return name.equals(p.name) && age==p.age; //name은 this.name, age는 this.age로 객체자신(this)와 obj를 비교
	}
	
	
}

	