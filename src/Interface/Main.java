package Interface;

public class Main {
    public static void main(String[] args) {
        Computer com = new Desktop();
        Computer lap = new Laptop();
        Developer dev = new Developer();
        dev.backendDeveloper(com);
    }
}
