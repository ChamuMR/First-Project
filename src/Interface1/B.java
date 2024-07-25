package Interface1;

public class B implements A,Y{
    public void speed(){
        System.out.println("This car can speed upto 230kmph");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate");
    }

    @Override
    public void clutch() {
        System.out.println("Clutch");
    }

    @Override
    public void brake() {
        System.out.println("Braking");
    }
}
