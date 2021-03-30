package chap03;

import java.util.Scanner;

class Ex03_05 {
	static int binSearchX(int[] a, int n, int key) {
		int pl=0; //�˻� ������ ù �ε���
		int pr=n-1; //�˻� ������ �� �ε���
		
		do {
			int pc = (pl+pr)/2; //�߾� ����� �ε���
			if(a[pc]==key) { //�˻��� key �˻� ����
				for(int i=pc;i>pl;i--) {
					if(a[i]==key)
						continue;
					else
						return i+1;
				}
			}
			else if(a[pc]<key) //�˻� ������ ���� �������� ����
				pl=pc+1;
			else //�˻� ������ ���� �������� ����
				pr=pc-1;
		} while(pl<=pr);
			
		return -1; //�˻� ����
	}
	
//	static int binSearchX(int[] a, int n, int key) {
//		int pl = 0; // �˻����� �� ���� index
//		int pr = n - 1; // �˻����� �� ���� index
//
//		do {
//			int pc = (pl + pr) / 2; // �߾ӿ���� index
//			if (a[pc] == key) {
//				for (; pc > pl; pc--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
//					if (a[pc - 1] < key)
//						break;
//				return pc; // �˻�����
//			} else if (a[pc] < key)
//				pl = pc + 1; // �˻������� ���� �������� ����
//			else
//				pr = pc - 1; // �˻������� ���� �������� ����
//		} while (pl <= pr);
//
//		return -1; // �˻�����
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = scan.nextInt();
		int[] x = new int[num];				// ��ڼ��� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��");			// ù ��� �Է�
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);		// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("�˻��� ����");		// Ű���� �Է�
		int ky = scan.nextInt();

		int idx = binSearchX(x, num, ky);	// �迭x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");

		}
}
