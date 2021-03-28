package chap02;
import java.util.Scanner;

class Ex02_02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	// �迭 a�� ��� ���� ��Ÿ��
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i=0;i<a.length/2;i++) {
			System.out.println("a["+i+"]��(��) a["+(a.length-i-1)+"]�� ��ȯ�մϴ�.");
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
		
		System.out.print("����� �� : ");
		int num = scan.nextInt(); //����� ��
		
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		reverse(x); //�迭 x�� ��Ҹ� �������� ����
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
		System.out.println("�迭 x�� ��� ����� �հ�� "+sumOf(x)+"�Դϴ�.");
	}
}
