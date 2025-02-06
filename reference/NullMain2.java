package reference;

public class NullMain2 {
    public static void main(String[] args) {
         Data data = null;
         data.value = 10; // NullPointerException 예외 발생 
        System.out.println("data = " + data.value); // 예외 발생 코드 아래로는 코드 실행이 되지 않음
    }
}
