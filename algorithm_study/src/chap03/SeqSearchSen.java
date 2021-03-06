package chap03;

import java.util.Scanner;

class SeqSearchSen {
	//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색
	static int seqSearchSen(int[] a, int n, int key) { 
		int i=0;
		
		a[n] = key; //보초를 추가
		
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i; //변수 i값이 n이면 찾은 값이 보초이므로 검색 실패 -> -1을 반환
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num+1]; //보초를 저장하기 위해 num+1
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x,num,ky);
		
		if(idx==1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}

}