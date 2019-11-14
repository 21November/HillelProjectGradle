package lesson3;

import lesson3.Student.Group;
import lesson3.TrainingRoom.Audience;
import lesson3.TrainingRoom.Faculty;
import lesson3.TrainingRoom.TheDepartment;
import lesson3.TrainingStaff.Teacher;

import java.util.Random;

public class TimetableOfClassesFactory {

    public TimetableOfClasses timetableOfClassesCreate (Faculty faculty){
        if (faculty == null){
            return null;
        }

        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String day = dayOfTheWeek[new Random().nextInt(dayOfTheWeek.length)];

        String[] time = {"08:00 - 09:20", "09:30 - 10:50", "11:30 - 12:50", "13:00 - 14:20", "14:30 - 15:50", "16:00 - 17:20"};
        String time2 = time[new Random().nextInt(time.length)];

        TheDepartment theDepartment = faculty.getTheDepartments()[new Random().nextInt(faculty.getTheDepartments().length)];

        Teacher teacher = theDepartment.getTeachers()[new Random().nextInt(theDepartment.getTeachers().length)];

        String thing = teacher.getThing();

        Group group = theDepartment.getGroups()[new Random().nextInt(theDepartment.getGroups().length)];

        Audience audience = theDepartment.getAudiences()[new Random().nextInt(theDepartment.getAudiences().length)];

        TimetableOfClasses timetableOfClasses = new TimetableOfClasses(day, time2, thing, teacher, group, audience);
        return timetableOfClasses;
    }
}
