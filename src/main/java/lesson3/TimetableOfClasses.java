package lesson3;

import lesson3.Student.Group;
import lesson3.TrainingRoom.Audience;
import lesson3.TrainingStaff.Teacher;

public class TimetableOfClasses {
    private String dayOfTheWeek;
    private String time;
    private String thing;
    private Teacher teacher;
    private Group group;
    private Audience audience;

    public TimetableOfClasses(String dayOfTheWeek, String time, String thing, Teacher teacher, Group group, Audience audience) {
        this.dayOfTheWeek = dayOfTheWeek;
        this.time = time;
        this.thing = thing;
        this.teacher = teacher;
        this.group = group;
        this.audience = audience;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public String getTime() {
        return time;
    }

    public String getThing() {
        return thing;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public Audience getAudience() {
        return audience;
    }
}
