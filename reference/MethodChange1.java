package reference;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) { // 변수의 값을 복사해서 대입하기 때문에 변수a에는 영향을 주지 않음
        x = 20;
    }
}
