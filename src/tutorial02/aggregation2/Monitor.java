package tutorial02.aggregation2;

public class Monitor {
    private int size;
    private Dimension dimension;

    public Monitor(int size, Dimension dimension) {
        this.size = size;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return String.format("A monitor of %d inches and maximum resolution %s pixel", size, dimension.toString());
    }
}
