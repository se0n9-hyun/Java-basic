package class1.ex;

import java.util.Scanner;
// Scanner 사용
public class ProductOrderMain1_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("결제할 상품 종류의 개수를 입력하세요: ");
        int amount = input.nextInt();

        System.out.println("각 상품의 이름을 입력하세요.");
        input.nextLine(); // 앞에서 .nextInt()를 사용했기 떄문에 버퍼를 비워줘야함
        String[] productName = new String[amount];
        for (int i = 0; i < productName.length; i++) {
            productName[i] = input.nextLine();
        }

        System.out.println("각 상품의 가격을 입력하세요.");
        int[] price = new int[amount];
        for (int i = 0; i < price.length; i++) {
            price[i] = input.nextInt();
            input.nextLine(); // 버퍼 비우기
        }

        System.out.println("각 상품의 수량을 입력하세요.");
        int[] quantity = new int[amount];
        for (int i = 0; i < quantity.length; i++) {
            quantity[i] = input.nextInt();
            input.nextLine(); // 버퍼 비우기
        }

        // ProductOrder 타입의 배열을 생성한 후, 객체를 생성해 각 배열 요소에 ProductOrder 참조값을 할당하는 코드
        ProductOrder[] products = new ProductOrder[amount];
        for (int i = 0; i < products.length; i++) {
            products[i] = new ProductOrder();
        }
        /*
        위 코드와 같은 코드
        ProductOrder product1 = new ProductOrder();
        ProductOrder product2 = new ProductOrder();
        ProductOrder product3 = new ProductOrder();

        ProductOrder[] products = {product1, product2, product3};
         */

        for (int i = 0; i < amount; i++) {
            products[i].productName = productName[i];
            products[i].price = price[i];
            products[i].quantity = quantity[i];
        }

        int sum = 0;
        for (ProductOrder p : products) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.price * p.quantity;
        }

        System.out.println("총 결제 금액: " + sum);
    }
}