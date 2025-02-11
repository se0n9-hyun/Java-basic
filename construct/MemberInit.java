package construct;

public class MemberInit {
    String name;
    int age  ;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name; // this -> 자기 자신의 인스턴스 참조값
        this.age = age;
        this.grade = grade;
    }
}
