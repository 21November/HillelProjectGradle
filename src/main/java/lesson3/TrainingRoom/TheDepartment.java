package lesson3.TrainingRoom;

import lesson3.Student.Group;
import lesson3.TrainingStaff.Teacher;

public class TheDepartment {
   private Audience[] audiences;
   private Teacher[] teachers;
   private Group[] groups;


    public TheDepartment(Audience[] audiences, Teacher[] teachers, Group[] groups) {
        this.audiences = audiences;
        this.teachers = teachers;
        this.groups = groups;
    }

    public Audience[] getAudiences() {
        return audiences;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Group[] getGroups() {
        return groups;
    }
}
