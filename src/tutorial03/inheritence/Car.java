package tutorial03.inheritence;

public class Car extends Vehicle {

    private int seatCapacity;

    public Car(String regNo, String owner, int seatCapacity) {
        super(regNo, owner);
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return String.format("Car %s with seat capacity %s",
            super.toString(),
            seatCapacity
        );
    }
}
