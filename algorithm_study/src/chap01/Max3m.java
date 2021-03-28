package chap01;

class Max3m {
	static int max3(int a, int b, int c) { //최댓값을 구하는 메서드
		int max = a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		
		return max; //구한 최댓값을 호출한 곳으로 반환
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = "+max3(3,2,1));
		System.out.println("max3(1,2,3) = "+max3(1,2,3));
		System.out.println("max3(2,1,3) = "+max3(2,1,3));
		
		System.out.println("min3(2,1,3) = "+min3(2,1,3));
		System.out.println("min3(2,1,3) = "+min3(2,1,3));
		System.out.println("min3(2,1,3) = "+min3(2,1,3));


	}

}
