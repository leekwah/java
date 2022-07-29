import java.util.Scanner;

class Dictionary { // Dictionary Ŭ���� ����
    static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" }; // kor �迭 (String) ���� 
    static String[] eng = { "love", "baby", "money", "future", "hope" }; // eng �迭 (String) ����
    Scanner scanner; // Scanner ��ü ����

    public Dictionary() { // Dictionary �޼ҵ� ����
    	scanner = new Scanner(System.in); // Scanner �Է� �ޱ�
    }
    
    String returnEng(String word) { // word�� �Ű������� ���� (String)
    	for (int i=0; i<kor.length; i++) {
    		if (kor[i].equals(word)) { // if�� ����, ���� �迭 kor�� �ִ� ���ڰ�, word�� ���� ���ڸ�,
    			return eng[i]; // kor�� ���� eng�� �迭 �ε����� return�Ѵ�.
    		}
    	}
    return null; // �׷��� ������, null���̴�.
    }
    void run() { // run�޼ҵ带 �����Ѵ�.
        System.out.println("�ѿ� �ܾ� �˻� ���α׷�"); // 1�� ��µȴ�.
        
        while(true) { // while���� ����
            System.out.print("�ѱ� �ܾ� �Է� : "); // �ݺ� �� �� ����, ��µȴ�.
            String kor = scanner.next(); // Scanner�� �Է¹޴� String�� kor�� �޾Ƽ� �����Ѵ�.
            
            if (kor.equals("�׸�")) { // kor�� "�׸�"�� ��쿡 ����Ǵ� if��
                System.out.println("���α׷� ����"); // "���α׷� ����"�� ����Ѵ�.
                break; // �׸���, while���� break������ ���´�.
            }
            
            String eng = returnEng(kor); //    
            if (eng != null) { // eng���� null���� �ƴ� ��, �� Scanner�� �Է¹޴� kor ���� eng�� ���� ����
            	System.out.println(kor+"�� ���� �ܾ�� " + eng+" �Դϴ�."); // �� ��¹��� ����ȴ�.
            } else { // �׷��� ���� ���, ��, ���� eng �迭�� ���� �ܾ�, �� kor���� ���� eng�� �ƴ� ��쿡�� 
            	System.out.println("������ ���� �ܾ��Դϴ�."); // "������ ���� �ܾ��Դϴ�." ��� ��¹��� ����ȴ�.
            }
        }
    }
}
public class Test04_Dictionary {

	public static void main(String[] args) {
		 Dictionary dictionary = new Dictionary(); // Dictionary Ŭ��������, dictionary ��ü�� �����Ѵ�.
		 dictionary.run(); // run �޼ҵ带 �����Ų��.
	}
}


