package chap02;

class PrimeNumber3 {
	public static void main(String[] args) { //����n�� n�� ������ ������ � �Ҽ��ε� ����������� ������ �Ҽ����� �̿�
		int counter=0; //������ �������� Ƚ��
		int ptr=0; //ã�� �Ҽ��� ����
		int[] prime=new int[500]; //�Ҽ��� �����ϴ� �迭
		
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		for(int n=5;n<=1000;n+=2) {
			boolean flag = false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				counter+=2;
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);
		
		System.out.println("������ �������� ������ Ƚ�� : "+counter);

	}

}
