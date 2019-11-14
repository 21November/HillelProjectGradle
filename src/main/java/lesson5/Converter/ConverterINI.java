package lesson5.Converter;

import lesson5.Student;

public class ConverterINI implements IStudentStringConverter {

    @Override
    public String convert(Student student) {

        if (student == null){
            return "Student class instance is empty";
        }

        return new StringBuilder().append("name = ").append(student.getName()).append("\n").
                append("age = ").append(student.getAge()).append("\n").toString();
    }
}
