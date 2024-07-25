package Abstract1;

public class Main {
    public static void main(String[] args) {
        Computer com = new Desktop();
        Computer lap = new Laptop();
        Developer d = new Developer();
        d.dev(lap);

    }
}
