class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10); 
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) 
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�."); //���� �ٸ� �� ��ü�� �׻� �ּҰ� �ٸ�
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	//Object equals()�� ��������ؼ� �ּҰ� �ƴ� value�� ��
	public boolean equals(Object obj) { //���� ���Ϸ��� �������̵� ����� ��, ������ �ּҸ� ��(���� �ٸ� ��ü�� �׻� ����) -> return this==obj (this:v1, obj:v2)
		//���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���
		if (!(obj instanceof Value)) return false;
		
		Value v = (Value)obj; // ����ȯ
		return this.value==v.value;
	}
}
