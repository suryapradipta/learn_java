package tutorial03.abstraction02;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String empNum, String name, String address, String DOB, double monthlySalary) {
        super(empNum, name, address, DOB);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
            "monthlySalary=" + monthlySalary +
            ", empNum=" + empNum +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", DOB='" + DOB + '\'' +
            '}';
    }
}
