package tutorial02.ppt;

public class TPC {
    private int numberOfProjects;
    private Project[] TPCProjects;
    final int MAX = 3;

    public TPC() {
        TPCProjects = new Project[MAX];
        numberOfProjects = 0;
    }

    public Project addProject(String projectName) {
        if (numberOfProjects == TPCProjects.length)
            return null;

        Project newPrj = new Project(projectName);
        TPCProjects[numberOfProjects++] = newPrj;
        return newPrj;
    }
}
