package chap01;
import java.util.Scanner;

class Ex01_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n�� ���� �Է��ϼ���.");
		
		int n=0;
		while(n<=0) {
			System.out.println("n : ");
			n = scan.nextInt();
			if(n>0) 
				break;
			System.out.println("���� ������ n�� �ٽ� �Է����ּ���.");
		}
		
//		int n;
//		do {
//			System.out.print("��������");
//			n = stdIn.nextInt();
//		} while (n <= 0);
		
		int no=0;
		while(n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("�� ���� "+no+"�ڸ��Դϴ�.");

	}

}
