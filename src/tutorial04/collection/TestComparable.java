package tutorial04.collection;

import javax.swing.*;
import java.util.*;

public class TestComparable {
    public static void main(String[] args) {

        TPC tpc = new TPC();

        tpc.addEmployee(new Employee("1", "Joe", 1000));
        tpc.addEmployee(new Employee("3", "Ali", 12));
        tpc.addEmployee(new Employee("2", "Barbara", 2312));
        tpc.addEmployee(new Employee("4", "Ahmad", 2312));

        ArrayList<Employee> employeeArrayList = tpc.getTPCEmployees();
//        Collections.sort(employeeArrayList);
        Collections.sort(employeeArrayList, new NameIDComparator());

        Iterator<Employee> iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getName().equals("Surya")) {
                iterator.remove();
            }
            System.out.println(e);
        }

        System.out.println();
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }


    }
}
