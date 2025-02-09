package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withDraw(int amount) {
        if (balance >= amount) { // 이 메서드에 파라미터가 있는 이유는 필드값을 사용하지 않고 main메서드에서의 변수값을 사용하기 때문이다.
            balance -= amount;
        }
        else {
            System.out.println("잔액 부족");
        }
    }
}
