package FinalKeyword;

public final class FinalVariableClassMethod {
    public final void show(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        final int a;
        final int b;
        FinalVariableClassMethod f = new FinalVariableClassMethod();
        f.show(12,32);

    }
}
