package tutorial03.abstraction02;

public class MainEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("A1", "Surya", "Bali", "23 May 2021", 6.5);
        System.out.println(fullTimeEmployee);

        // widening
        Employee e2 = fullTimeEmployee;
        System.out.println(e2);

        // downcasting or narrowing
        FullTimeEmployee temp;
        temp = (FullTimeEmployee) e2;
        System.out.println(temp);

    }

}
