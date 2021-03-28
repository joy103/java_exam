package chap02;

import java.util.Scanner;

class ArrayEqual { //�� �迭�� ������ ��
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
		
		System.out.print("�迭 a�� ����� �� : ");
		int na = scan.nextInt(); //����� ��
		
		int[] a = new int[na];
		
		for(int i=0;i<na;i++) {
			System.out.print("x["+i+"] : ");
			a[i]=scan.nextInt();
		}
		
		System.out.print("�迭 b�� ����� �� : ");
		int nb = scan.nextInt(); //����� ��
		
		int[] b = new int[nb];
		
		for(int i=0;i<nb;i++) {
			System.out.print("x["+i+"] : ");
			b[i]=scan.nextInt();
		}
		
		System.out.println("�迭 a�� b�� "+(equals(a,b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		
	}
}
