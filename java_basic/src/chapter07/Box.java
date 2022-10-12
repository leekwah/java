package chapter07;

public class Box {
    // 다양한 객체를 저장하기 위해서 Object를 사용
    private Object object; // 2. 필드에 대입
    public void set(Object object) {
         this.object = object; // 1. 매개변수가 참조하는 값을 참조변수에 대입 이후에
    }
    public Object get() { // 3. 대입된 필드값을 리턴해주는 것
        return object;
    }
}
