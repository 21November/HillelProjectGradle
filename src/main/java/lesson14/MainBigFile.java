package lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainBigFile {
    public static void main(String[] args) throws IOException {

        FileInputStream file1 = new FileInputStream("file1.txt");
        FileOutputStream file2 = new FileOutputStream("file2.txt");

        byte[] buffer = new byte[1000];
        int readCount = file1.read(buffer);

        while (readCount >= 0){
            file2.write(buffer,0, readCount);
        }

        file1.close();
        file2.close();
    }
}
