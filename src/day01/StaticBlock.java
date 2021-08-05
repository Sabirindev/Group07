package day01;

public class StaticBlock {

    public static String name;
    public static int number;
    public static char aChar;
    public static double num;
    public static long num1;

    static {
        name="CybertekSchool";
    }
    static {
        number=10;
    }
    static {
        aChar='A';
    }
    static {
        num1=10L;
    }
}
