package chapter07;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("홍길동"); // Object = String 타입이 자동타입변환이 되는 것이다.
        String name = (String) box.get(); // Object 타입이 String 타입이 아니기 때문에, 캐스팅을 해야한다.
        // Box.java 참고
        System.out.println(name);

        box.set(new Apple()); // Object가 최상위 슈퍼클래스이기 때문에, 대입가능
        Apple apple = (Apple) box.get(); // box처럼 저장할 때, 타입변환과 불러올 때 타입변환이 필요하다.
        // 하지만 성능에 좋지 못한 결과를 가져오기 때문에, 사용하지 않는 것을 추천한다.
        System.out.println(apple);
    }
}
