package tutorial02.aggregation;

public class Room {
    private String name;
    private int noOfChairs;
    private boolean isBooked;

    private Dimension dimension;
    private Window window;

    public Room(String name, int noOfChairs, boolean isBooked, Dimension dimension, Window window) {
        this.name = name;
        this.noOfChairs = noOfChairs;
        this.isBooked = isBooked;
        this.dimension = dimension;
        this.window = window;
    }

    @Override
    public String toString() {
        return String.format("Room %s with %s (in m), with %s and %s chairs, " +
                "and is already booked: %s",
            name,
            dimension.toString(),
            window.toString(),
            noOfChairs,
            isBooked);
    }
}
