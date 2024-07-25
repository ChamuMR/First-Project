package AnonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        A obj = new A(){

            public void show() {
                System.out.println("In inner class method");
            }
            public void drive(){
                System.out.println("Driving class method");
            }
        };
        obj.show();
        obj.drive();






    }
}
