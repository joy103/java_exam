class Data3 {int x;}

class Ex6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x=10;
		
		Data3 d2 = copy(d); //tmp�� �ּ� ���� -> d2�� tmp�� ����Ű�� ��ü�� ����Ŵ/ copy �޼����� ��ȯŸ�԰� Ÿ���� ���ƾ� ��
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = " +d2.x);
	}
	
	static Data3 copy(Data3 d) { // ������ ��ȯŸ��
		Data3 tmp = new Data3(); //���ο� ��ü tmp ����
		tmp.x = d.x; // d.x ���� tmp.x �� ����
		return tmp; //������ ��ü�� �ּҸ� ��ȯ
	} 
	

}