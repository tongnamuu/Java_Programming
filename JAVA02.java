/**
 * JAVA02 변수, 데이터 타입
 */
public class JAVA02 {
    public static void main(String[] args) {
        int number1 = 10;
        boolean bool = true;
        String str = " This is Java ";
        System.out.println("정수, 참/거짓, 문자열");
        System.out.println(number1);
        System.out.println(bool);
        System.out.println(str);
        int number2 = 33;
        System.out.println("문자열과 숫자를 더한다면?");
        System.out.println(number1 + str + number2);
        System.out.println(str + number1 + number2);// number1, number2 as string
        System.out.println(number1 + number2 + str);
        number1 = number2 = 1;
        System.out.println("증감식의 작동");
        System.out.println(number1++);
        System.out.println(number1);
        System.out.println(++number2);
        System.out.println(number2);
    }
}