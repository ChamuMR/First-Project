package InnerClass;

public class A {
    int age = 23;

    public void drive(){
        System.out.println("Driving class A");
    }
    class B{
        public void drive(){
            System.out.println("Driving class B");
        }
    }
    static class C{
        public void drive(){
            System.out.println("Driving static class C");
        }
    }
}
