import java.util.*;

class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue�� �ִ� 5�������� ����

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in); //ȭ�����κ��� ���δ����� �Է¹���
				String input = s.nextLine().trim(); //trim()���� ���� ���� ����
				
				if("".equals(input)) continue; //�Է��� �� ���ڿ��̸� pass
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ "+MAX_SIZE+"�� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input); //�Է¹��� ��ɾ� ����
					
					LinkedList tmp = (LinkedList)q; 
					ListIterator it = tmp.listIterator(); //LinkdedList�� ������ ������
					
					while(it.hasNext())
						System.out.println(++i+"."+it.next());
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
			
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) //�Է��� �� ���ڿ����� Ȯ��
			q.offer(input); //Queue�� ����
		
		if(q.size()>MAX_SIZE) //size()�� Collections �������̽��� ����
			q.remove(); //Queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� ����
	}

}
