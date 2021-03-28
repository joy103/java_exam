package chap02;

import java.util.Scanner;

class Ex02_04 {
	static void copy(int[] a, int[] b) { //배열 b를 배열 a에 복사
		a = b.clone();
		System.out.println("<배열 a>");
		print(a);
		System.out.println("<배열 b>");
		print(b);
	}

	
//	static void copy(int[] a, int[] b) {
//		int num = a.length <= b.length ? a.length : b.length;
//		for (int i = 0; i < num; i++)
//			a[i] = b[i];
//	}
	

	static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 요소의 수 : ");
		int na = scan.nextInt(); //요소의 수
		
		int[] a = new int[na];
		
		for(int i=0;i<na;i++) {
			System.out.print("x["+i+"] : ");
			a[i]=scan.nextInt();
		}
				
		System.out.print("배열 b의 요소의 수 : ");
		int nb = scan.nextInt(); //요소의 수
		
		
		int[] b = new int[nb];
		
		for(int i=0;i<nb;i++) {
			System.out.print("x["+i+"] : ");
			b[i]=scan.nextInt();
		}
		
		copy(a,b);

	}

}
