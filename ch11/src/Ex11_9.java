import java.util.*;

class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); //(�ߺ�x, ����x)
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]); //HashSet�� objArr�� ��ҵ��� ���� 
		}
		
		System.out.println(set); //HashSet�� ����� ��ҵ��� ���
		
		Iterator it = set.iterator(); //HashSet�� ����� ��ҵ��� ���(Iterator�̿�)
		
		while(it.hasNext()) { //�о�� ��Ұ� �ִ��� Ȯ���ؼ�
			System.out.println(it.next()); //��� �ϳ� ��������
		}
		
		
	}
}


	