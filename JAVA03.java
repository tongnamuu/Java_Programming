/**
 * JAVA03 Class, Method
 */
class Student {
    String name;
    int test_score;

    Student() { // 생성자
    }

    Student(String name, int test_score) { // 생성자
        this.name = name;
        this.test_score = test_score;
    }

    /* Setter, Getter */
    public void setTest_score(int test_score) {
        this.test_score = test_score;
    }

    public int getTest_score() {
        return test_score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void print() {
        System.out.println(name + "의 점수는 : " + test_score);
    }
}

public class JAVA03 {

    public static void main(String[] args) {
        Student s = new Student();
        s.setTest_score(77);
        s.setName("R");
        s.print();
        Student k = new Student("K", 90);
        k.print();
    }

}