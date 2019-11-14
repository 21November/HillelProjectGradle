package lesson5.Converter;

import lesson5.Student;

public class ConverterJSON implements IStudentStringConverter {

    @Override
    public String convert(Student student) {

        if (student == null) {
            return "Student class instance is empty";
        }

        return new StringBuilder().append("\"name\" : ").append("\"").append(student.getName()).append("\"").append("\n")
                .append("\"age\" : ").append("\"").append(student.getAge()).append("\"").append("\n").toString();
    }
}
