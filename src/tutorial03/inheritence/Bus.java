package tutorial03.inheritence;

public class Bus extends Vehicle {
    private int sittingCapacity;
    private int standingCapacity;

    public Bus(String regNo, String owner, int sittingCapacity, int standingCapacity) {
        super(regNo, owner);
        this.sittingCapacity = sittingCapacity;
        this.standingCapacity = standingCapacity;
    }

    public int getSittingCapacity() {
        return sittingCapacity;
    }

    public void setSittingCapacity(int sittingCapacity) {
        this.sittingCapacity = sittingCapacity;
    }

    public int getStandingCapacity() {
        return standingCapacity;
    }

    public void setStandingCapacity(int standingCapacity) {
        this.standingCapacity = standingCapacity;
    }

    @Override
    public String toString() {
        return String.format("Bus %s with sitting capacity: %d and standing capacity: %d",
            super.toString(), sittingCapacity, standingCapacity);
    }
}

