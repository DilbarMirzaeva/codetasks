package fileIO;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private String courseName;
    private int courseDuration;
    private List<Group> group=new ArrayList<>();

    public Course(String courseName, int courseDuration) {

        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group.add(group);
    }

    @Override
    public String toString() {
        return "Turing{" +
                "courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                ", group=" + group +
                '}';
    }
}
