package lesson3.Student;

public class Group {
    String groupName;
    Student[] students;

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }
}
