import java.util.*;

class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개까지만 저장

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in); //화면으로부터 라인단위로 입력받은
				String input = s.nextLine().trim(); //trim()으로 양쪽 공백 제거
				
				if("".equals(input)) continue; //입력이 빈 문자열이면 pass
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input); //입력받은 명령어 저장
					
					LinkedList tmp = (LinkedList)q; 
					ListIterator it = tmp.listIterator(); //LinkdedList의 내용을 보여줌
					
					while(it.hasNext())
						System.out.println(++i+"."+it.next());
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
			
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) //입력이 빈 문자열인지 확인
			q.offer(input); //Queue에 저장
		
		if(q.size()>MAX_SIZE) //size()는 Collections 인터페이스에 정의
			q.remove(); //Queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제
	}

}
