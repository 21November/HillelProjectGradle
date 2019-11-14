package lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {

        int n = 50;

        try (PrintWriter writer = new PrintWriter( new FileOutputStream("random.txt"))){
            int line;
            while(n > 0) {
                line =(int) (Math.random()*1150 - 500);
                writer.print(line + ",");
                n--;
            }
        }catch (
                IOException e){
            e.printStackTrace();
        }
    }
}
