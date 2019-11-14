package lesson5;

import lesson5.Converter.ConverterINI;
import lesson5.Converter.ConverterJSON;
import lesson5.Converter.ConverterXML;
import lesson5.Print.IStudentPrinter;
import lesson5.Print.NullPrinter;
import lesson5.Print.PrintSystemOut;
import lesson5.Print.PrinterDelegating;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Boss", 27);
        ConverterINI converterINI = new ConverterINI();
        ConverterXML converterXML = new ConverterXML();
        ConverterJSON converterJSON = new ConverterJSON();

        IStudentPrinter studentPrinter1 = new PrintSystemOut(converterXML);
        IStudentPrinter studentPrinter2 = new NullPrinter(converterINI);
        IStudentPrinter studentPrinter3 = new PrintSystemOut(converterINI);
        IStudentPrinter studentPrinter4 = new NullPrinter(converterINI);
        IStudentPrinter studentPrinter5 = new PrintSystemOut(converterJSON);


        studentPrinter1.studentPrint(student);
        studentPrinter2.studentPrint(student);
        studentPrinter3.studentPrint(student);
        studentPrinter4.studentPrint(student);
        studentPrinter5.studentPrint(student);
        studentPrinter1.studentPrint(null);

        System.out.println();
        System.out.println("Delegating");
        System.out.println();

        IStudentPrinter studentPrinter = new PrinterDelegating(new IStudentPrinter[]{
                new PrintSystemOut(converterINI),
                new NullPrinter(converterJSON),
                studentPrinter1,
                studentPrinter2,
                studentPrinter3,
                studentPrinter4,
                studentPrinter5
        });

        studentPrinter.studentPrint(student);
    }
}
