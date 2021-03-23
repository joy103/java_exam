import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); //(중복x, 순서x)
		
		for (int i=0;set.size()<6;i++) {
			int num =(int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
			
			//set은 정렬 불가 -> List로 옮겨서 정렬
		List list = new LinkedList(set); //LinkedList(Collection c) Collection은 인터페이스
		Collections.sort(list); //Collections.sort(List list) Collections는 클래스
		System.out.println(list);

	}
}


	