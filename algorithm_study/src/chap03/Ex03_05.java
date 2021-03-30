package chap03;

import java.util.Scanner;

class Ex03_05 {
	static int binSearchX(int[] a, int n, int key) {
		int pl=0; //검색 범위의 첫 인덱스
		int pr=n-1; //검색 범위의 끝 인덱스
		
		do {
			int pc = (pl+pr)/2; //중앙 요소의 인덱스
			if(a[pc]==key) { //검색할 key 검색 성공
				for(int i=pc;i>pl;i--) {
					if(a[i]==key)
						continue;
					else
						return i+1;
				}
			}
			else if(a[pc]<key) //검색 범위를 뒤쪽 절반으로 좁힘
				pl=pc+1;
			else //검색 범위를 앞쪽 절반으로 좁힘
				pr=pc-1;
		} while(pl<=pr);
			
		return -1; //검색 실패
	}
	
//	static int binSearchX(int[] a, int n, int key) {
//		int pl = 0; // 검색범위 맨 앞의 index
//		int pr = n - 1; // 검색범위 맨 뒤의 index
//
//		do {
//			int pc = (pl + pr) / 2; // 중앙요소의 index
//			if (a[pc] == key) {
//				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
//					if (a[pc - 1] < key)
//						break;
//				return pc; // 검색성공
//			} else if (a[pc] < key)
//				pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
//			else
//				pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
//		} while (pl <= pr);
//
//		return -1; // 검색실패
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = scan.nextInt();
		int[] x = new int[num];				// 요솟수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]：");			// 첫 요소 입력
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);		// 바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("검색할 값：");		// 키값을 입력
		int ky = scan.nextInt();

		int idx = binSearchX(x, num, ky);	// 배열x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");

		}
}
