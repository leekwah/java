import java.util.Scanner;

class Ex5_10_1{
	public static void main(String[] args) {
		String[][] words = {
			{"chair","����"},      	// words[0][0], words[0][1]
			{"computer","��ǻ��"}, 	// words[1][0], words[1][1]
			{"integer","����"}     	// words[2][0], words[2][1]
		};

		//��ĳ�ʸ� ���ؼ� �Է�
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<words.length;i++) {
			// ������ �����ش�.
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			//%d�� ����, ���� ��� ������
			//%s�� ���ڿ� ��� ������
			//words[i][0]���� ������ ����.
			String tmp = scanner.nextLine();
			//tmp�� ���� �����Ѵ�.
			if(tmp.equals(words[i][1])) {
			//if������ ������, �´ٴ� �� ��� 
				System.out.printf("�����Դϴ�.%n%n");
				//�ٹٲ޹��ڷ� %n�� ���. \n�� �ᵵ ����� ����.
			} else {
				//Ʋ���� else������ Ʋ�ȴٰ� ���, ���Ŀ� �迭�� ���� �� ���� for��
			   System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);
			}
		} // for
	} // main�� ��
}