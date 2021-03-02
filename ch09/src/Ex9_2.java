class Person {
	long id; //this.id
	
	//�ּҰ��� �ƴ� ������� id���� ���ϵ��� �ϱ����� �������̵�
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) 
			return false; // Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ� ����
		
		Person p = (Person)obj; //obj�� ObjectŸ������ id���� �����ϱ� ���ؼ��� PersonŸ������ ����ȯ�� �ʿ�
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
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�."); //���� �ٸ� �� ��ü�� �׻� �ּҰ� �ٸ�
	}

}


