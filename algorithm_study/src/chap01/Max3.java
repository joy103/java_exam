package chap01;
import java.util.Scanner;

class Max3 { //3���� �������� �Է��ϰ� �ִ밪�� ����
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = num.nextInt();
		System.out.println("b�� �� : ");
		int b = num.nextInt();
		System.out.println("c�� �� : ");
		int c = num.nextInt();
		
		int max = a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		
		System.out.println("�ִ��� "+max+"�Դϴ�.");

	}

}
