abstract class Player { //�߻�Ŭ����(�̿ϼ� Ŭ����)
	abstract void play(int pos); //�߻�޼���(�̿ϼ� �޼���)
	abstract void stop(); //�߻�޼���(����θ� �ְ� ������{}�� ���� �޼���)
}

//�߻�Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos+"��ġ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}  
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); //�߻�Ŭ������ ��ü�� ���� -> ����
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // ������ -> ���� ��ü�� ������ �ִ� �޼��尡 ȣ��
		ap.play(100);
		ap.stop();
	}

}
