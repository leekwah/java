class Ex6_1 { 
	public static void main(String args[]) { 
		// ������ �������
		// ��ü ����
		Tv t;                 // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();         // Tv�ν��Ͻ��� �����Ѵ�. 
		// ��ü ������� (color, power, channel, channelup, channeldown, etc)
		// �������� t�� ��ü���� tv�� ����Ų��.	
		t.channel = 7;        // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. (�������) 
		t.channelDown();      // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. (�޼��� ���)
		System.out.println("���� ä���� " + t.channel + " �Դϴ�."); // ���� ä���� 6 �Դϴ�.
	} 
}

class Tv { 
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	int channel;           	// ä�� 

	// Tv�� ���(�޼���) 
	void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}