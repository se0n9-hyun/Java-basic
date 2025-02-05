package reference;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 객체가 생성되어 참조값이 부여됨
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
