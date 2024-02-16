package tutorial04.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TPC {
    private ArrayList<Employee> TPCEmployees;

    public TPC() {
        TPCEmployees = new ArrayList<Employee>();
    }

    public void setTPCEmployees() {
        if (TPCEmployees == null) {
            TPCEmployees = new ArrayList<Employee>();
        }
    }

    public ArrayList<Employee> getTPCEmployees() {
        return TPCEmployees;
    }

    public void addEmployee(Employee employee) {
        TPCEmployees.add(employee);
    }

    public Employee findEmployee(String ID) {
        for (int i = 0; i < getTPCEmployees().size(); i++) {
            Employee employee = getTPCEmployees().get(i);
            if (employee.getEmpNum().equals(ID)) {
                return employee;
            }
        }
        return null;
    }

    public double totalPay() {
        double total = 0.0;
        Iterator<Employee> employeeIterator = TPCEmployees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            total+= employee.calculatePay();
        }
        return total;
    }
}
