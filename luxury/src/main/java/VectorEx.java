import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(3);
        v.add(-2);

        // Vector 중간에 삽입하기 index 2번째에 넣는 값
        v.add(2, 100);

        System.out.println("벡터 내의 요소 객체수 : " + v.size());
        System.out.println("백터의 현재 용량 : "+v.capacity());

        // 모든 요소 출력
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        // 모든 요소 더하기
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i); // Vecter의 i번째 정수
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
