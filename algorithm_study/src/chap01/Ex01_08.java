package chap01;
import java.util.Scanner;

class Ex01_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가우스의 덧셈을 이용한 1~n까지의 합");
		System.out.println("n : ");
		int n = scan.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 "+n+"까지의 합은 : "+sum+"입니다.");
		
	}

}
