
class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner(); //�ν��Ͻ� ��������� ���� ���� ������ ����
	static StaticInner cv = new StaticInner(); // static ��������� ���� ���� ������ ����
	
	static void staticMethod() { 
//		InstanceInner obj1 = new InstanceInner(); //static����� �ν��Ͻ� ����� ���� ������ �Ұ�
		StaticInner obj2 = new StaticInner();
		
		Ex7_13 outer = new Ex7_13(); //���� �����Ϸ��� ��ü�� �����ؾ��� 
		InstanceInner obj1 = outer.new InstanceInner(); //�ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ���� ����
	}
	
	void instanceMethod() { //�ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner(); 
		StaticInner Obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); //�޼��� ���� ���������� ����� ����Ŭ������ �ܺο��� ���� �Ұ�
	}
	
	void method() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}

}