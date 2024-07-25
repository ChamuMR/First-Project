package EnumClass;

public class Main {

    public static void main(String[] args) {
        Laptop l = Laptop.Macbook;
        System.out.println(l.getPrice());

        for(Laptop l1 : Laptop.values()){
            System.out.println(l1 +" : " + l1.getPrice());
        }
    }
}
