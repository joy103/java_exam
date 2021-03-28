package chap01;

class Ex01_16 {
	static void spira(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 'i%10'를 나타냄
				System.out.print(i%10);
			System.out.println(); 						// 개행(줄변환)
		}
	}
	
	public static void main(String[] args) {
		System.out.println("spira(10)");
		spira(10);
		System.out.println("npira(12)");
		npira(12);

	}

}
