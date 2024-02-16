package tutorial03.inheritence;

public abstract class Vehicle {
    private String regNo;
    private String owner;

    public Vehicle(String regNo, String owner) {
        this.regNo = regNo;
        this.owner = owner;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return regNo + " owned by " + owner;
    }
}
