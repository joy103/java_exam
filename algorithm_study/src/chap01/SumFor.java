package chap01;
import java.util.Scanner;

class SumFor { //1부터 n까지 정수의 합
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
				
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = num.nextInt();
		
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
