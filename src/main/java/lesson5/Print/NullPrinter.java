package lesson5.Print;

import lesson5.Student;
import lesson5.Converter.IStudentStringConverter;

public class NullPrinter implements IStudentPrinter {
    private IStudentStringConverter iStudentStringConverter;

    public NullPrinter(IStudentStringConverter iStudentStringConverter) {
        this.iStudentStringConverter = iStudentStringConverter;
    }

    @Override
    public void studentPrint(Student student) {
        // NOTE: intentionally does nothing
        //System.out.println("+++");
    }
}
