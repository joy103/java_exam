package chap02;

import java.util.Scanner;

class ArrayEqual { //두 배열이 같은지 비교
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
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
		
		System.out.println("배열 a와 b는 "+(equals(a,b) ? "같습니다." : "같지 않습니다."));
		
	}
}
