import java.util.Scanner;

class Dictionary {
    static String[] kor = { "����", "����", "��" }; 
    static String[] eng = { "����", "����", "��" };
    Scanner scanner;

    public Dictionary() { 
    	scanner = new Scanner(System.in);
    }
    
    String returnEng(String word) {
    	for (int i=0; i<kor.length; i++) {
    		if (kor[i].equals(word)) {
    			return eng[i];
    		}
    	}
    return null;
    }
    void run() {
        System.out.println("�ѿ� �ܾ� �˻� ���α׷�");
        
        while(true) {
            System.out.print("�ѱ� �ܾ� �Է� : ");
            String kor = scanner.next();
            
            if (kor.equals("�׸�")) {
                System.out.println("���α׷� ����");
                break;
            }
            
            String eng = returnEng(kor);    
            if (eng != null) {
            	System.out.println(kor+"�� ���� �ܾ�� " + eng+" �Դϴ�.");
            } else { 
            	System.out.println("������ ���� �ܾ��Դϴ�.");
            }
        }
    }
}
public class Test05_RockPaperScissors {

	public static void main(String[] args) {
		 Dictionary dictionary = new Dictionary();
		 dictionary.run();
	}
}


