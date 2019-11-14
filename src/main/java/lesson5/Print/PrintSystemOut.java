package lesson5.Print;

import lesson5.Student;
import lesson5.Converter.IStudentStringConverter;

public class PrintSystemOut implements IStudentPrinter {
    private IStudentStringConverter iStudentStringConverter;

    public PrintSystemOut(IStudentStringConverter iStudentStringConverter) {
        this.iStudentStringConverter = iStudentStringConverter;
    }

    @Override
    public void studentPrint(Student student) {
        System.out.println(iStudentStringConverter.convert(student));
    }
}
