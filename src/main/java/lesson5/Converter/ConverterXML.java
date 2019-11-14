package lesson5.Converter;

import lesson5.Student;

public class ConverterXML implements IStudentStringConverter {

    @Override
    public String convert(Student student) {

        if (student == null){
            return "Student class instance is empty";
        }

        return new StringBuilder().append("<Student>").append("\n").
                append("    <name>").append(student.getName()).append("</name>").append("\n").
                append("    <age>").append(student.getAge()).append("</age>").append("\n").
                append("</Student>").append("\n").toString();
    }
}
