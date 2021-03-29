package chap02;

import java.util.Scanner;

class CardConvRev {
	static int cardConvR(int x, int r, char[] d) { // ���� x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �����ϰ� �ڸ����� ��ȯ
		int digits=0; //��ȯ�� ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //x�� r�� ���� �������� �ε����� �ش��ϴ� ���ڸ� ����
			x/=r;
		} while (x!=0);
		return digits;
	}
	
	static int cardConv(int x, int r, char[] d) { // ���� x�� r������ ��ȯ�Ͽ� �迭 d�� ���ڸ����� �����ϰ� �ڸ����� ��ȯ
		int digits=0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //x�� r�� ���� �������� �ε����� �ش��ϴ� ���ڸ� ����
			x/=r;
		} while (x!=0);
		
		for(int i=0;i<digits;i++) {
			char tmp = d[i];
			d[i]=d[digits-i-1];
			d[digits-i-1]=tmp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no; // ��ȯ�ϴ� ����
		int cd; // ���
		int dno; // ��ȯ ���� �ڸ���
		int retry; // �ٽ� �ϴ��� ���� Ȯ�� 
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no=scan.nextInt();
			} while (no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd=scan.nextInt();
			} while(cd<2||cd>36);
			
			dno = cardConvR(no,cd,cno); //no�� cd������ ��ȯ
			
			System.out.print(cd+"�����δ� ");
			for (int i=dno-1;i>=0;i--) { //���ڸ����� ���ʷ� ��Ÿ��
				System.out.print(cno[i]); 
			}
			System.out.println("�Դϴ�.");
			
//			dno = cardConv(no, cd, cno); // no�� cd������ ��ȯ
//
//			System.out.print(cd + "�����δ� ");
//			for (int i = 0; i < dno; i++) // ���ڸ����� ���ʷ� ��Ÿ��
//				System.out.print(cno[i]);
//			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = scan.nextInt();				
		} while(retry==1);
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
