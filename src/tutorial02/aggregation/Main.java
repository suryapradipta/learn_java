package tutorial02.aggregation;

public class Main {
    public static void main(String[] args) {
        Window window = new Window("West");
        System.out.println(window);

        Dimension dimension = new Dimension(5, 4);
        System.out.println(dimension);

        Room room = new Room("TR1", 15, false, dimension, window );
        System.out.println(room);
    }
}
