package chap01;
import java.util.Scanner;

class Ex01_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n의 값을 입력하세요.");
		
		int n=0;
		while(n<=0) {
			System.out.println("n : ");
			n = scan.nextInt();
			if(n>0) 
				break;
			System.out.println("양의 정수로 n을 다시 입력해주세요.");
		}
		
//		int n;
//		do {
//			System.out.print("정수값：");
//			n = stdIn.nextInt();
//		} while (n <= 0);
		
		int no=0;
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 "+no+"자리입니다.");

	}

}
