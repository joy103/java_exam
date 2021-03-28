package chap01;

class Ex01_15 {
	static void triangleLB(int n) { //왼쪽 아래가 직각인 이등변 삼각형
		for(int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) { //왼쪽 위가 직각인 이등변 삼각형
		for(int i=n;i>0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {//오른쪽 위가 직각인 이등변 삼각형
		for(int i=n;i>0;i--) {			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) { //오른쪽 아래가 직각인 이등변 삼각형
		for(int i=n;i>0;i--) {			
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("triangleLB(5)");
		triangleLB(5);
		System.out.println("triangleLU(5)");
		triangleLU(5);
		System.out.println("triangleRU(5)");
		triangleRU(5);
		System.out.println("triangleRB(5)");
		triangleRB(5);

	}

}
