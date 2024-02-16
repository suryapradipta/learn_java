package tutorial03.abstraction;

public abstract class Shape {
    protected String name;

    abstract public double getArea();

    public Shape(String name) {
        this.name = name;
    }

    final public boolean lessThan(Shape rhs) {
        return getArea() < rhs.getArea();
    }

}
