package tutorial02.aggregation;

public class Dimension {
    private int width;
    private int length;

    public Dimension(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("%d x %d", width, length);
    }
}
