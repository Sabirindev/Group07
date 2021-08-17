package testVitalii.Inheritance;

public class Car extends Transport {

    public Car(String name, boolean isExpensive, boolean isFast, int speed) {
        super(name, isExpensive, isFast, speed);
    }

    public void drive (){
        System.out.println("Many people like to travel by " + name);
    }
    public void gotFlatTire(){
        System.out.println("It happened sometimes when " + name + "got flat tire" );
    }

}
