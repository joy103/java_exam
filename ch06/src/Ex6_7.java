class Data2 {int x;}

class Ex6_7 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
		

	}
	
	static void change(Data2 d) { //참조형 매개변수 -> change 메서드에서 d를 이용해서 객체 사용 가능 (읽기&쓰기 가능)
		d.x=1000; 
		System.out.println("change() : x = "+d.x);
	}
	

}