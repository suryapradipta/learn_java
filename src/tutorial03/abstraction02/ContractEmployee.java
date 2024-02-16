package tutorial03.abstraction02;

public class ContractEmployee extends FullTimeEmployee {
    private String contractStart;
    private String contractEnd;

    public ContractEmployee(String empNum, String name, String address,
                            String DOB, double monthlySalary,
                            String contractStart,
                            String contractEnd) {
        super(empNum, name, address, DOB, monthlySalary);
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
    }

    public String getContractStart() {
        return contractStart;
    }

    public void setContractStart(String contractStart) {
        this.contractStart = contractStart;
    }

    public String getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
            "contractStart='" + contractStart + '\'' +
            ", contractEnd='" + contractEnd + '\'' +
            ", empNum=" + empNum +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", DOB='" + DOB + '\'' +
            '}';
    }
}
