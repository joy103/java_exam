
class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner { 
		int iiv = outerIv; //�ܺ�Ŭ������ private ����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv; //staticŬ������ �ܺ�Ŭ������ �ν��Ͻ������ ���� �Ұ�
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0; //�޼��� ����� �Բ� �Ҹ� (�����ε� ���� �ȹٲ�� ���� ����� ����)
		final int LV = 0; //JDK1.8���� final ���� ����(�����ε� ���� �ȹٲ�� ���� ����� ����)
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // �ܺ�Ŭ������ ���������� final�� ���� ����(���)�� ���� ���� 
			//���� Ŭ������ ��ü�� lv���� �� ���� ������ �� ����-> �׷��� JDK1.8���ʹ� ������ �ƴ�
			int liv4 = LV;
		}
	}
}
