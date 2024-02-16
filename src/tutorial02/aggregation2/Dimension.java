package tutorial02.aggregation2;

public class Dimension {
    private int width;
    private int length;

    public Dimension(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("%d by %d", width, length);
    }
}
