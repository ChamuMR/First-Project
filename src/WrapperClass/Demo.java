package WrapperClass;

public class Demo {
    public static void main(String[] args) {
        int num = 2;
        Integer i = num;
        // primitive datatype to wrapper class
        System.out.println("This is called Auto-boxing : "+i);

        int num2 = i;
        //Wrapper class to primitive data type
        System.out.println("This is called Auto-unboxing : "+num2);


    }
}
