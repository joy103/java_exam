import java.util.*;

public class Ex10_5 { //달력만들기

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Usage : java Ex10_5 2019 9"); //run configuration으로 값을 입력해줘야 함
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK=0; //1일의 요일
		int END_DAY=0; //마지막날
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		
	    //월의 경우 0부터 11의 값을 가지므로 1을 빼줘야 함
		sDay.set(year, month-1,1);
		eDay.set(year, month,1); //다음달
		
		//다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 됨
		eDay.add(Calendar.DATE, -1);
		
		//첫 번째요일이 무슨 요일인지 알아냄
		START_DAY_OF_WEEK=sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜를 얻어옴
		END_DAY=eDay.get(Calendar.DATE);
		
		System.out.println("      "+args[0]+"년 "+args[1]+"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력
		//만일 1일이 수요일이면 공백을 세번 찍음
		for(int i=1;i<START_DAY_OF_WEEK;i++)
			System.out.print("   ");
		
		for(int i=1,n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++) {
			System.out.print((i<10)? "  "+i : " "+i);
			if(n%7==0) System.out.println();
		}

	}

}
