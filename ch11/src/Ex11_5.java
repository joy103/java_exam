import java.util.*;

class Ex11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인
			Object obj = it.next(); //요소를 읽어오기
			System.out.println(obj);
		}
		
		//iterator는 1회용이라 다 쓰고나면 다시 얻어와야 함
		it = list.iterator(); //새로운 iterator객체를 얻음
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		for(int i=0;i<list.size();i++) { //ArrayList를 HashSet으로 변경하면 작동안하는 단점(Set은 Collection의 자손)
			Object obj = list.get(i);
			System.out.println(obj);
		}

	}

}
