package testVitalii.Inheritance;

public class Transport {
    public String name;

    public boolean isExpensive;
    public boolean isFast;
    public int speed;

    public Transport(String name,  boolean isExpensive, boolean isFast, int speed) {
        this.name = name;
        this.isExpensive = isExpensive;
        this.isFast = isFast;
        this.speed = speed;
    }

    public void onReparing(){

        System.out.println("Service team is fixing " + name);

    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", isExpensive=" + isExpensive +
                ", isFast=" + isFast +
                ", speed=" + speed +
                '}';
    }
}
