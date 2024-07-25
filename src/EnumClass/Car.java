//package EnumClass;
//
//public class Car {
//    public static void main(String[] args) {
//        Main m[] = Main.values();
//        for(Main m1:m){
//            System.out.println(m1 + " : "+m1.ordinal());
//        }
//
//        Main m1 = Main.Failed;
//        if(m1 == Main.Failed){
//            System.out.println("Mission Failed");
//        } else if (m1 == Main.Pending) {
//            System.out.println("Pending Mission");
//        } else if (m1 == Main.Running) {
//            System.out.println("Mission Running");
//        }
//        else{
//            System.out.println("Mission Success");
//        }
//
//
//        switch (m1){
//            case Failed -> System.out.println("Mission Failed");
//            case Pending -> System.out.println("Pending Mission");
//            case Running -> System.out.println("Mission Running");
//            case Success -> System.out.println("Mission Success");
//            default -> System.out.println("Mission Unknown");
//        }
//
//
//    }
//
//}
