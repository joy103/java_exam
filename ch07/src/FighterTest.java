abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�."); }
}

interface Fightable { //�������̽��� ��� �޼���� public abstract
	void move(int x, int y); //public abstract�� ������
	void attack(Fightable f); //public abstract�� ������
}	

class Fighter extends Unit2 implements Fightable {
	//�������̵� ��Ģ : ����(public)���� ���������ڰ� ������ �ȵ�
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	Fightable getFightable() { //�ο� �� �ִ� ��븦 �ҷ���
		Fightable f = new Fighter(); //Fighter�� �����ؼ� ��ȯ
		return f;
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 u = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
//		u.attack(f2); //Unit2���� attack()�� ��� ȣ�� �Ұ�
		f.stop();
		
		Fightable f3 = new Fighter();
		f3.move(100,200);
		f3.attack(new Fighter());
//		f3.stop(); //Fightable���� stop()�� ��� ȣ�� �Ұ�
		
		Fightable f4 = f.getFightable();

	}
}


