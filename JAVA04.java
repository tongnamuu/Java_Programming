/**
 * JAVA04
 */
class Parent {
    int b;

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Children Constructor");
    }
}

public class JAVA04 {

    public static void main(String[] args) {
        Parent a = new Child();
        // Child c = new Parent();
        Child b = new Child();
    }
}