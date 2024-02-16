package tutorial02.aggregation;

public class Window {
    private String direction;

    public Window(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "window facing " + direction;
    }
}
