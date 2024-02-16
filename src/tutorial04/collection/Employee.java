package tutorial04.collection;

public class Employee implements Comparable<Employee> {
    private String empNum;
    private String name;
    private double rate;

    public Employee(String empNum, String name, double rate) {
        this.empNum = empNum;
        this.name = name;
        this.rate = rate;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empNum='" + empNum + '\'' +
            ", name='" + name + '\'' +
            ", rate=" + rate +
            '}';
    }

    public double calculatePay() {
        return getRate();
    }

    @Override
    public int compareTo(Employee employee) {
        if (this == employee)
            return 0;
        return (this.empNum.compareTo(employee.empNum));
    }
}
