package chap01;
import java.util.Scanner;

class SumForPos { //1���� n������ ���� ���� (����� �Է�)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("1���� n������ �������մϴ�.");

		do { //n>0�� �� ���� �ݺ� (�����Ǵܹݺ�)
			System.out.print("n�� ����");
			n = scan.nextInt();
		} while (n <= 0); 

		int sum = 0;		
		for (int i = 1; i <= n; i++)
			sum += i;		

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
