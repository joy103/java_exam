package chap01;
import java.util.Scanner;

class Median { //3���� �������߿��� �߾Ӱ��� ����
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(c>=a)
				return a;
			else
				return c;
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = num.nextInt();
		System.out.println("b�� �� : ");
		int b = num.nextInt();
		System.out.println("c�� �� : ");
		int c = num.nextInt();
		
		System.out.println("�߾Ӱ��� "+med3(a,b,c)+"�Դϴ�.");

	}

}
