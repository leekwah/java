package chapter03;

public class Test1 {
	public static void main(String[] args) {
	 for(int i = 1; i<= 99; i++) {
            if(i%10 == 3 || i%10 == 6 || i%10 == 9){
                if(i/10 == 3 || i/10 == 6 || i/10 == 9) {
                    System.out.println(i+" 박수 두 번");
                } else {
                    System.out.println(i+" 박수 한 번");
                    }
            } else if(i/10 == 3||i/10 == 6||i/10 == 9) {
                System.out.println(i+" 박수 한 번");
            }
        }
	}
}



