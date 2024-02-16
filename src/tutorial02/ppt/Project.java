package tutorial02.ppt;

public class Project {
    private String projectName;
    private int projectNum;

    private static int nextProjectNo = 0;

    public Project(String projectName) {
        setProjectName(projectName);
        setProjectNum(nextProjectNo++);
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectNum(int projectNum) {
        this.projectNum = projectNum;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectNum() {
        return projectNum;
    }
}
