import java.util.*;

class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc"); //HashSet�� add�޼���� ���ο� ��Ҹ� �߰��ϱ� ���� ������ ����� ��ҿ� ���� ������ �Ǻ��ϱ� ����
		set.add("abc"); // �߰��Ϸ��� ����� equals()�� hashCode()�� ȣ�� -> �������̵� �ʿ�
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
		if(!(obj instanceof Person)) return false; //����ȯ�� üũ
		Person p = (Person)obj; //����ȯ
		return name.equals(p.name) && age==p.age; //name�� this.name, age�� this.age�� ��ü�ڽ�(this)�� obj�� ��
	}
	
	
}

	