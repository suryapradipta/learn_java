package tutorial02.ppt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TPC tpc = new TPC();

        System.out.print("Enter a project name: ");
        String projName = sc.nextLine();
        while (!projName.isEmpty()) {
            Project newPrj = tpc.addProject(projName);

            if (newPrj == null) {
                System.out.println("The capacity of the project is full");
            } else {
                System.out.println(newPrj.getProjectName());
                System.out.println(newPrj.getProjectNum());;
            }
            System.out.print("Enter a project name: ");
            projName = sc.nextLine();
        }

    }
}
