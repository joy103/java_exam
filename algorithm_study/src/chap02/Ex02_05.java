package chap02;

import java.util.Scanner;

public class Ex02_05 {
	// �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
		static void rcopy(int[] a, int[] b) {
			int num = a.length <= b.length ? a.length : b.length;
			for (int i = 0; i < num; i++)
				a[i] = b[b.length - i - 1];
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("a�� ��ڼ��� ��");
			int numa = scan.nextInt(); // ��ڼ�
			int[] a = new int[numa]; // ��ڼ� numa�� �迭
			for (int i = 0; i < numa; i++) {
				System.out.print("a[" + i + "] : ");
				a[i] = scan.nextInt();
			}

			System.out.print("b�� ��ڼ��� ��");
			int numb = scan.nextInt(); // ��ڼ�
			int[] b = new int[numb]; // ��ڼ� numb�� �迭
			for (int i = 0; i < numb; i++) {
				System.out.print("b[" + i + "] : ");
				b[i] = scan.nextInt();
			}

			rcopy(a, b); // �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy

			System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����߽��ϴ�.");
			for (int i = 0; i < numa; i++)
				System.out.println("a[" + i + "] = " + a[i]);
		}
}
