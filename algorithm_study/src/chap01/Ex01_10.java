package chap01;
import java.util.Scanner;

class Ex01_10 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	
	System.out.println("a : ");
	a = scan.nextInt();
	
	int b=0;
	while (a>=b) { //a<b�� �� ������ �ݺ�
		System.out.println("b : ");
		b = scan.nextInt();
		if(a<b) 
			break;
		System.out.println("a���� ū ���� �Է��ϼ���!");
	}
	
	int result = b-a;
	
	System.out.println("b-a�� ���� "+result+"�Դϴ�.");
	}
}
