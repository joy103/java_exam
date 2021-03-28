package chap02;
import java.util.Scanner;

class Ex02_02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	// 배열 a의 요소 값을 나타냄
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i=0;i<a.length/2;i++) {
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a,i,a.length-i-1);
			print(a);
//			for(int j=0;j<a.length;j++) {
//				System.out.print(a[j]+" ");
//			}
//			System.out.println();
		}
	}
	
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소의 수 : ");
		int num = scan.nextInt(); //요소의 수
		
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		reverse(x); //배열 x의 요소를 역순으로 정렬
		
		System.out.println("역순 정렬을 마쳤습니다.");
		System.out.println("배열 x의 모든 요소의 합계는 "+sumOf(x)+"입니다.");
	}
}
