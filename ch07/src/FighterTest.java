abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable { //인터페이스의 모든 메서드는 public abstract
	void move(int x, int y); //public abstract가 생략됨
	void attack(Fightable f); //public abstract가 생략됨
}	

class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안됨
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	Fightable getFightable() { //싸울 수 있는 상대를 불러옴
		Fightable f = new Fighter(); //Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 u = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
//		u.attack(f2); //Unit2에는 attack()이 없어서 호출 불가
		f.stop();
		
		Fightable f3 = new Fighter();
		f3.move(100,200);
		f3.attack(new Fighter());
//		f3.stop(); //Fightable에는 stop()이 없어서 호출 불가
		
		Fightable f4 = f.getFightable();

	}
}


