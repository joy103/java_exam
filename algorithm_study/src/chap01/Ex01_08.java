package chap01;
import java.util.Scanner;

class Ex01_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���콺�� ������ �̿��� 1~n������ ��");
		System.out.println("n : ");
		int n = scan.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1���� "+n+"������ ���� : "+sum+"�Դϴ�.");
		
	}

}
