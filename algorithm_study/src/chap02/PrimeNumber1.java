package chap02;

class PrimeNumber1 {
	public static void main(String[] args) { //소수는 2부터 n-1까지의 어떤 정수로도 나누어 떨어지지 않음을 이용
		int counter = 0; // 나눗셈의 횟수
		
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0) //나누어떨어지면 소수가 아님
					break;
			}
			if(n==i) //안쪽 for문이 종료된 시점
				System.out.println(n);
		}

	}

}
