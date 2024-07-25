package Interface1;

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.accelerate();

        X obj1 = new B();
        obj1.brake();

        Y obj2 = new B();
        obj2.clutch();

        System.out.println(A.age); // Because Variables are Static we can call them directly by using interface
        System.out.println(obj.age);
    }
}
