package tutorial04.collection;

import java.util.Comparator;

public class NameIDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // compare by name first
        int result = o1.getName().compareTo(o2.getName());
        System.out.println("result: " + result);
        if (result != 0) {
            return result;
        }

        // if name the same, compare id
        return o1.getEmpNum().compareTo(o2.getEmpNum());
    }
}
