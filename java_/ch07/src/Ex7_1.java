class Tv {
	boolean power; // ��������(on/off)
	int channel;	// ä��

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

class SmartTv extends Tv { //�ڽ� ��� 2�� + �θ��� 5�� = �� 7�� (�ڵ尡 �����ִٰ� �����ϸ� �ȴ�.)  
	// CaptionTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption;     // ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if (caption) {   // ĸ�� ���°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		// channel cannot be resolved or is not a field -> �θ� ���ó�� ���� ��
		stv.channel = 10;			// ���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();			// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// ĸ��(�ڸ�) ����� �Ҵ�.	       
		stv.displayCaption("Hello, World");
	}
}


