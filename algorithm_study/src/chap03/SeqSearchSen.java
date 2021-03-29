package chap03;

import java.util.Scanner;

class SeqSearchSen {
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻�
	static int seqSearchSen(int[] a, int n, int key) { 
		int i=0;
		
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i; //���� i���� n�̸� ã�� ���� �����̹Ƿ� �˻� ���� -> -1�� ��ȯ
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = scan.nextInt();
		int[] x = new int[num+1]; //���ʸ� �����ϱ� ���� num+1
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x,num,ky);
		
		if(idx==1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}

}