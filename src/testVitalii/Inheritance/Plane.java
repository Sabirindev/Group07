package testVitalii.Inheritance;

public class Plane extends Transport {

    public Plane(String name, boolean isExpensive, boolean isFast, int speed) {
        super(name, isExpensive, isFast, speed);
    }

    public void fly(){
        System.out.println("The fastest way to travel is flying on " + name);
    }



}
