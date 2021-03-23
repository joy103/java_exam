import java.util.*;

class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); //(중복x, 순서x)
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]); //HashSet에 objArr의 요소들을 저장 
		}
		
		System.out.println(set); //HashSet에 저장된 요소들을 출력
		
		Iterator it = set.iterator(); //HashSet에 저장된 요소들을 출력(Iterator이용)
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인해서
			System.out.println(it.next()); //요소 하나 꺼내오기
		}
		
		
	}
}


	