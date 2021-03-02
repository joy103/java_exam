class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10); 
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) 
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다."); //서로 다른 두 객체는 항상 주소가 다름
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	//Object equals()를 오버라딩해서 주소가 아닌 value를 비교
	public boolean equals(Object obj) { //값을 비교하려면 오버라이딩 해줘야 함, 원래는 주소를 비교(서로 다른 객체는 항상 거짓) -> return this==obj (this:v1, obj:v2)
		//참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
		if (!(obj instanceof Value)) return false;
		
		Value v = (Value)obj; // 형변환
		return this.value==v.value;
	}
}
