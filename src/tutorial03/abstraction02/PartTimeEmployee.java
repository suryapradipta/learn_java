package tutorial03.abstraction02;

public class PartTimeEmployee extends Employee{
    private int hourlyRate;

    public PartTimeEmployee(String empNum, String name, String address, String DOB, int monthlySalary) {
        super(empNum, name, address, DOB);
        this.hourlyRate = monthlySalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
            "hourlyRate=" + hourlyRate +
            ", empNum=" + empNum +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", DOB='" + DOB + '\'' +
            '}';
    }
}
