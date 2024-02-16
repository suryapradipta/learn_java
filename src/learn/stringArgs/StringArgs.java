package learn.stringArgs;

public class StringArgs {
    public static void main(String[] args) {
        int radius;
        final double PI = 3.14;

        radius = 10;

        double area  = PI * radius;
        int IntArea = (int) area;


        System.out.println("For a circle radius : " + IntArea);
    }
}
