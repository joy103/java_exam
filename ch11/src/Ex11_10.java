import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); //(�ߺ�x, ����x)
		
		for (int i=0;set.size()<6;i++) {
			int num =(int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
			
			//set�� ���� �Ұ� -> List�� �Űܼ� ����
		List list = new LinkedList(set); //LinkedList(Collection c) Collection�� �������̽�
		Collections.sort(list); //Collections.sort(List list) Collections�� Ŭ����
		System.out.println(list);

	}
}


	