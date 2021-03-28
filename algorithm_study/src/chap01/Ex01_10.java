package chap01;
import java.util.Scanner;

class Ex01_10 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	
	System.out.println("a : ");
	a = scan.nextInt();
	
	int b=0;
	while (a>=b) { //a<b가 될 때까지 반복
		System.out.println("b : ");
		b = scan.nextInt();
		if(a<b) 
			break;
		System.out.println("a보다 큰 값을 입력하세요!");
	}
	
	int result = b-a;
	
	System.out.println("b-a의 값은 "+result+"입니다.");
	}
}
