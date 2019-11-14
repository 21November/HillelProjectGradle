package lesson3;

import lesson3.Student.Group;
import lesson3.Student.Student;
import lesson3.Student.StudentFactory;
import lesson3.TrainingRoom.Audience;
import lesson3.TrainingRoom.AudienceFactory;
import lesson3.TrainingRoom.Faculty;
import lesson3.TrainingRoom.TheDepartment;
import lesson3.TrainingStaff.Teacher;
import lesson3.TrainingStaff.TeacherFactory;

public class Main {

    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        TeacherFactory teacherFactory = new TeacherFactory();
        AudienceFactory audienceFactory = new AudienceFactory();
        TimetableOfClassesFactory timetableOfClassesFactory = new TimetableOfClassesFactory();
        Functions functions = new Functions();

        Teacher[] teachers = new Teacher[5];
        teachers[0] = new Teacher("Iosif", "Stalin", "Chemistry", 50, 0010);
        teachers[1] = new Teacher("Ivan", "Fomin", "Maths", 45, 0011);
        teachers[2] = new Teacher("Albert", "Einstein", "Physics", 150, 0012);
        teachers[3] = teacherFactory.teacherCreate();
        teachers[4] = teacherFactory.teacherCreate();

        Teacher[] teachers1 = new Teacher[5];
        teachers1[0] = teacherFactory.teacherCreate();
        teachers1[1] = teacherFactory.teacherCreate();
        teachers1[2] = teacherFactory.teacherCreate();
        teachers1[3] = teacherFactory.teacherCreate();
        teachers1[4] = teacherFactory.teacherCreate();

        Student[] students = new Student[5];
        students[0] = new Student("Bob", 18, 1001);
        students[1] = new Student("Jac", 18, 1002);
        students[2] = new Student("Adam", 18, 1003);
        students[3] = new Student("Sem", 18, 1004);
        students[4] = new Student("Tom", 18, 1005);

        Student[] students1 = new Student[5];
        students1[0] = new Student("Lusi", 18, 1006);
        students1[1] = new Student("Vica", 18, 1007);
        students1[2] = new Student("Julia", 18, 1008);
        students1[3] = new Student("Natali", 18, 1009);
        students1[4] = new Student("Vera", 18, 1010);

        Student[] students2 = new Student[5];
        students2[0] = studentFactory.studentCreate();
        students2[1] = studentFactory.studentCreate();
        students2[2] = studentFactory.studentCreate();
        students2[3] = studentFactory.studentCreate();
        students2[4] = studentFactory.studentCreate();

        Student[] students3 = new Student[5];
        students3[0] = studentFactory.studentCreate();
        students3[1] = studentFactory.studentCreate();
        students3[2] = studentFactory.studentCreate();
        students3[3] = studentFactory.studentCreate();
        students3[4] = studentFactory.studentCreate();


        Group[] groups = new Group[2];
        groups[0] = new Group("A10", students);
        groups[1] = new Group("A12", students1);

        Group[] groups1 = new Group[2];
        groups1[0] = new Group("C10", students2);
        groups1[1] = new Group("C12", students3);

        Group[] groups2 = new Group[2];
        groups2[0] = new Group("D10", students2);
        groups2[1] = new Group("D12", students3);

        Group[] groups3 = new Group[2];
        groups3[0] = new Group("X10", students);
        groups3[1] = new Group("X12", students1);

        Group[] groups4 = new Group[2];
        groups4[0] = new Group("Y10", students2);
        groups4[1] = new Group("Y12", students3);

        Group[] groups5 = new Group[2];
        groups5[0] = new Group("Z10", students2);
        groups5[1] = new Group("Z12", students3);

        Audience[] audiences = new Audience[5];
        audiences[0] = new Audience(210, 15, "Chemistry");
        audiences[1] = new Audience(215, 15, "Physics");
        audiences[2] = new Audience(220, 15, "Maths");
        audiences[3] = audienceFactory.audienceCreate();
        audiences[4] = audienceFactory.audienceCreate();

        Audience[] audiences1 = new Audience[5];
        audiences1[0] = audienceFactory.audienceCreate();
        audiences1[1] = audienceFactory.audienceCreate();
        audiences1[2] = audienceFactory.audienceCreate();
        audiences1[3] = audienceFactory.audienceCreate();
        audiences1[4] = audienceFactory.audienceCreate();

        TheDepartment[] theDepartments = new TheDepartment[3];
        theDepartments[0] = new TheDepartment(audiences, teachers, groups);
        theDepartments[1] = new TheDepartment(audiences, teachers, groups1);
        theDepartments[2] = new TheDepartment(audiences, teachers, groups2);
        Faculty faculty = new Faculty(theDepartments);

        TheDepartment[] theDepartments1 = new TheDepartment[3];
        theDepartments1[0] = new TheDepartment(audiences1, teachers1, groups3);
        theDepartments1[1] = new TheDepartment(audiences1, teachers1, groups4);
        theDepartments1[2] = new TheDepartment(audiences1, teachers1, groups5);
        Faculty faculty1 = new Faculty(theDepartments1);

        TimetableOfClasses[] timetableOfClasses = new TimetableOfClasses[13];
        timetableOfClasses[0] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[1] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);
        timetableOfClasses[2] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[3] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);
        timetableOfClasses[4] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[5] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);
        timetableOfClasses[6] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[7] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);
        timetableOfClasses[8] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[9] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);
        timetableOfClasses[10] = timetableOfClassesFactory.timetableOfClassesCreate(faculty);
        timetableOfClasses[11] = timetableOfClassesFactory.timetableOfClassesCreate(faculty1);

        functions.printTimetableOfClasses(timetableOfClasses);

    }

}
