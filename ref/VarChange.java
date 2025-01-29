package ref;

public class VarChange {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA 객체가 복사되서 dataB가 만들어진게 아니라 참조값이 들어가는 것

        System.out.println("dataA 참조 = " + dataA);
        System.out.println("dataB 참조 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA로 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // dataA와 dataB가 같은 참조값을 가지고 있기 때문

        // dataB로 변경 -> dataA와 같은 참조값으로 가서 값을 변경
        dataB.value = 30;
        System.out.println("변경 dataA.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
