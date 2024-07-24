package UpCastingDownCasting;

public class Up {
    public static void main(String[] args) {
        K k = new L();
        k.show1();//Overriding Parents method

        L l = (L) k;
        l.show1();

    }
}
