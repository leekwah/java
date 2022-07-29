import java.util.Scanner;

class Dictionary { // Dictionary 클래스 생성
    static String[] kor = { "사랑", "아기", "돈", "미래", "희망" }; // kor 배열 (String) 생성 
    static String[] eng = { "love", "baby", "money", "future", "hope" }; // eng 배열 (String) 생성
    Scanner scanner; // Scanner 객체 선언

    public Dictionary() { // Dictionary 메소드 선언
    	scanner = new Scanner(System.in); // Scanner 입력 받기
    }
    
    String returnEng(String word) { // word를 매개변수로 설정 (String)
    	for (int i=0; i<kor.length; i++) {
    		if (kor[i].equals(word)) { // if문 설정, 만약 배열 kor에 있는 문자가, word와 같은 문자면,
    			return eng[i]; // kor과 같은 eng의 배열 인덱스를 return한다.
    		}
    	}
    return null; // 그렇지 않으면, null값이다.
    }
    void run() { // run메소드를 설정한다.
        System.out.println("한영 단어 검색 프로그램"); // 1번 출력된다.
        
        while(true) { // while문을 선언
            System.out.print("한글 단어 입력 : "); // 반복 될 때 마다, 출력된다.
            String kor = scanner.next(); // Scanner로 입력받는 String을 kor로 받아서 저장한다.
            
            if (kor.equals("그만")) { // kor이 "그만"일 경우에 실행되는 if문
                System.out.println("프로그램 종료"); // "프로그램 종료"를 출력한다.
                break; // 그리고, while문을 break문으로 나온다.
            }
            
            String eng = returnEng(kor); //    
            if (eng != null) { // eng값이 null값이 아닐 때, 즉 Scanner로 입력받는 kor 값과 eng이 같을 때는
            	System.out.println(kor+"의 영어 단어는 " + eng+" 입니다."); // 이 출력문이 선언된다.
            } else { // 그렇지 않은 경우, 즉, 만약 eng 배열에 없는 단어, 즉 kor값과 같은 eng가 아닐 경우에는 
            	System.out.println("사전에 없는 단어입니다."); // "사전에 없는 단어입니다." 라는 출력문이 선언된다.
            }
        }
    }
}
public class Test04_Dictionary {

	public static void main(String[] args) {
		 Dictionary dictionary = new Dictionary(); // Dictionary 클래스에서, dictionary 객체를 생성한다.
		 dictionary.run(); // run 메소드를 실행시킨다.
	}
}


