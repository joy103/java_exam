package chap01;
import java.util.Scanner;

class SumForPos { //1부터 n까지의 합을 구함 (양수만 입력)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을구합니다.");

		do { //n>0일 때 까지 반복 (사후판단반복)
			System.out.print("n의 값：");
			n = scan.nextInt();
		} while (n <= 0); 

		int sum = 0;		
		for (int i = 1; i <= n; i++)
			sum += i;		

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
