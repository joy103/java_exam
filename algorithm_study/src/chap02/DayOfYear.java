package chap02;

import java.util.Scanner;

class DayOfYear {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ����
	};
	
	static int isLeap(int year) { //�������� ������� �Ǵ�(����:1,���:0)
		return (year%4==0 && year%100!=0 || year%400==0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1;i<m;i++) {
			days += mdays[isLeap(y)][i-1];
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");  int year  = scan.nextInt();	// ��
			System.out.print("����");  int month = scan.nextInt();	// ��
			System.out.print("�ϣ�");  int day   = scan.nextInt();	// ��

			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));

			System.out.print("�ѹ� �� �ұ��? (1.����0.�ƴϿ�����");
			retry = scan.nextInt();
		} while (retry == 1);
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
