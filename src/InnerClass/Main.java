package InnerClass;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.age);
        a.drive();

        A.B b = a.new B();
        b.drive();

        //If static
        A.C c = new A.C();
        c.drive();
    }
}
