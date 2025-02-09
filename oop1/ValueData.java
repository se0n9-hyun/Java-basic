package oop1;

public class ValueData {
    int value;

    void add() { // 지역변수와 다르게 클래스의 필드값을 직접 사용하므로 파라미터를 받을 필요가 없음
        value++;
        System.out.println("숫자 증가 = " + value); // 앞에 static을 붙이지 않는다.
    }
}
