import java.util.Scanner;

class Dictionary {
    static String[] kor = { "가위", "바위", "보" }; 
    static String[] eng = { "가위", "바위", "보" };
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
        System.out.println("한영 단어 검색 프로그램");
        
        while(true) {
            System.out.print("한글 단어 입력 : ");
            String kor = scanner.next();
            
            if (kor.equals("그만")) {
                System.out.println("프로그램 종료");
                break;
            }
            
            String eng = returnEng(kor);    
            if (eng != null) {
            	System.out.println(kor+"의 영어 단어는 " + eng+" 입니다.");
            } else { 
            	System.out.println("사전에 없는 단어입니다.");
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


