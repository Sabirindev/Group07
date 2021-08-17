package testVitalii.Inheritance;

public class Travel {
    public static void main(String[] args) {
        Plane plane = new Plane("Plane", true,true,900);
        Car car = new Car("Car", false, false, 55);

        car.drive();
        car.gotFlatTire();

        plane.onReparing();
        plane.fly();




    }
}
