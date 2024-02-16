package tutorial03.abstraction02;

public abstract class Employee {
    protected String empNum;
    protected String name;
    protected String address;
    protected String DOB;

    public Employee(String empNum, String name, String address, String DOB) {
        this.empNum = empNum;
        this.name = name;
        this.address = address;
        this.DOB = DOB;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empNum=" + empNum +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", DOB='" + DOB + '\'' +
            '}';
    }
}
