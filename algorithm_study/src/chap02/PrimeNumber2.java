package chap02;

class PrimeNumber2 {
	public static void main(String[] args) { // �Ҽ��� 2���� n-1������ � �Ҽ��ε� ����������� ������ �̿�
		int counter=0; //�������� Ƚ��
		int ptr=0; //ã�� �Ҽ��� ����
		int[] prime=new int[500];
		
		prime[ptr++]=2; //2�� �Ҽ��̱⿡ prime[0]�� ����
		
		for (int n=3;n<=1000;n+=2) { //4 �̻��� ¦���� 2�� ������ �������Ƿ� Ȧ�� ���� ���
			int i;
			for(i=1;i<ptr;i++) { //�̹� ã�� �Ҽ��� ������ ��
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
		System.out.println("�������� ������ Ƚ�� : "+counter);
		
	}

}
