class Data3 {int x;}

class Ex6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x=10;
		
		Data3 d2 = copy(d); //tmp의 주소 복사 -> d2는 tmp가 가르키는 객체를 가르킴/ copy 메서드의 반환타입과 타입이 같아야 함
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = " +d2.x);
	}
	
	static Data3 copy(Data3 d) { // 참조형 반환타입
		Data3 tmp = new Data3(); //새로운 객체 tmp 생성
		tmp.x = d.x; // d.x 값을 tmp.x 에 복사
		return tmp; //복사한 객체의 주소를 반환
	} 
	

}