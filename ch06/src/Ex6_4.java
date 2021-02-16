class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); //2.MyMath 객체 생성
		long result = mm.max(5, 3); //3.MyMath 객체 사용(객체의 메서드 호출)
		long result1 = mm.add(5L, 3L); //add메서드 호출 -> 값이 add메서드로 갔다가 작업을 마치면 반환값이 호출한 곳으로 돌아옴
		long result2 = mm.subtract(5L, 3L); //5와 3으로 적어도 가능 (자동형변환)
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L,3L) = "+result);
		System.out.println("add(5L,3L) = "+result1);
		System.out.println("subtract(5L,3L) = "+result2);
		System.out.println("multiply(5L,3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
	
	}


}


class MyMath {  //1.MyMath 클래스 작성(메서드 작성)
	long add(long a, long b) {
		long result = a + b;
		return result; //return a+b; 한 줄로 간단히 가능
	}
	long subtract(long a, long b) { return a-b;}
	long multiply(long a, long b) { return a*b;}
	long divide(long a, long b) { return a/b;}
	
	//두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		long result = 0;
		if(a>b) {  
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	
	//삼항연산자 사용
	long max1(long a, long b) {
		long result = a > b ? a : b;
		return result;
	}
	
}