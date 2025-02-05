package reference;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90); // 반환된 참조값을 변수 student1에 저장
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 새로운 객체를 만들고 초기값 설정하는 과정을 메서드로 한 번에 처리한다.
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // x001 참조값을 반환함
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}