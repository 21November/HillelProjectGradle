package lesson5.Print;

import lesson5.Student;


public class PrinterDelegating implements IStudentPrinter {
    private final IStudentPrinter[] iStudentPrinters;

    public PrinterDelegating(IStudentPrinter[] iStudentPrinters) {
        this.iStudentPrinters = iStudentPrinters;
    }

    @Override
    public void studentPrint(Student student) {

        for (IStudentPrinter iStudentPrinter : iStudentPrinters){
            iStudentPrinter.studentPrint(student);
        }
    }
}
