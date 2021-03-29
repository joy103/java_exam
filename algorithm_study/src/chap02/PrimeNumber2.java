package chap02;

class PrimeNumber2 {
	public static void main(String[] args) { // 소수는 2부터 n-1까지의 어떤 소수로도 나누어떨어지지 않음을 이용
		int counter=0; //나눗셈의 횟수
		int ptr=0; //찾은 소수의 개수
		int[] prime=new int[500];
		
		prime[ptr++]=2; //2는 소수이기에 prime[0]에 저장
		
		for (int n=3;n<=1000;n+=2) { //4 이상의 짝수는 2로 나누어 떨어지므로 홀수 값만 대상
			int i;
			for(i=1;i<ptr;i++) { //이미 찾은 소수로 나누어 봄
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr==i)
				prime[ptr++]=n;
		}
		
		for (int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
		
	}

}
