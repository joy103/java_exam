package chap02;

import java.util.Scanner;

class Ex02_09 {
		static int[][] mdays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 윤년
		};
		
		static int isLeap(int year) { //윤년인지 평년인지 판단(윤년:1,평년:0)
			return (year%4==0 && year%100!=0 || year%400==0) ? 1 : 0;
		}
		
		static int leftDayOfYear(int y,int m, int d) {
			int days = d;
			for(int i=1;i<m;i++) {
				days += mdays[isLeap(y)][i-1];
			}
			
			int sumdays = 0;
			for(int i=0;i<mdays[isLeap(y)].length;i++) {
				sumdays+=mdays[isLeap(y)][i];
			}
			
			return sumdays-days;
		}
		
//		static int leftDayOfYear(int y, int m, int d) {
//			int days = d; // 일수
//
//			for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
//				days += mdays[isLeap(y)][i - 1];
//			return 365 + isLeap(y) - days;
//		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int retry;
			
			System.out.println("그 해 경과 일 수를 구합니다.");

			do {
				System.out.print("년：");  int year  = scan.nextInt();	// 년
				System.out.print("월：");  int month = scan.nextInt();	// 월
				System.out.print("일：");  int day   = scan.nextInt();	// 일

				System.out.printf("연내의 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

				System.out.print("한번 더 할까요? (1.예／0.아니오）：");
				retry = scan.nextInt();
			} while (retry == 1);
			
			System.out.println("프로그램을 종료합니다.");

	}

}
