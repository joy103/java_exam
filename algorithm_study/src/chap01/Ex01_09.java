package chap01;

class Ex01_09 {
	static int sum(int a, int b) {
		int from = (a>b) ? b : a;
		int to = (a>b) ? a : b;
		
		int sum=0;
		for(int i=from;i<=to;i++) {
			sum+=i;
		}
		return sum;
	}
	
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // 합
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}
	
	public static void main(String[] args) {
		System.out.println("sumof(a,b) = "+sum(3,5));
		System.out.println("sumof(a,b) = "+sum(6,4));
		System.out.println("sumof(a,b) = "+sum(5,5));
		
		System.out.println("sumof(a,b) = "+sumof(3,5));
		System.out.println("sumof(a,b) = "+sumof(6,4));
		System.out.println("sumof(a,b) = "+sumof(5,5));

	}

}
