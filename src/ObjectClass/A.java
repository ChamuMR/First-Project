package ObjectClass;

import java.util.Objects;

public class A {
    String name;
    int age;
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return age == a.age && Objects.equals(name, a.name);
    }

    public A() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a);//Here is will call toString() Automatically when we call obj
//        System.out.println(a.toString());
        // public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        System.out.println(a.toString());
        a.age = 12;
        a.name = "Shyam";
        A a2 = new A();
        a2.name = "Shyam";
        a2.age = 12;
        System.out.println(a.equals(a2));


    }
}
