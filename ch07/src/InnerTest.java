class AAA { //AAA�� DDD�� �ܺ�Ŭ����
	int i;
	BBB b = new BBB();
	
	class DDD { //DDD�� AAA�� ����Ŭ���� (DDD�� AAA�ȿ����� ���δٴ� ����)
		void method() {
//			AAA a = new AAA(); 
//			System.out.println(a.i);
			System.out.println(i); //��ü �������� �ܺ� Ŭ������ ��� ���� ���� 
			
		}
	}
}

class BBB {
	void method() {
		AAA a = new AAA(); //BBB���� AAA�� ����Ϸ��� ��ü�� ��������� ��
		System.out.println(a.i);
	}
}

class CCC {
	BBB b = new BBB();
//	DDD d = new DDD(); //CCC�� DDD�� ���� �Ұ�
}


public class InnerTest {

	public static void main(String[] args) {
		BBB b = new BBB();
		b.method();
	}

}
