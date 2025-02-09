package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withDraw(9000);
        account.withDraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}