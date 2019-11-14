package lesson1;

public class Homework {

    public static void main(String[] args) {

        //By 3, or not by 3?
        //A trick I learned in elementary school to determine whether or not a number was divisible by three is to add
        // all of the integers in the number together and to divide the resulting sum by three. If there is no remainder
        // from dividing the sum by three, then the original number is divisible by three as well.
        //Given a series of numbers as a string, determine if the number represented by the string is divisible by three.
        //You can expect all test case arguments to be strings representing values greater than 0.
        //Example:
        //divisibleByThree('123') // true
        //divisibleByThree('8409') // true
        //divisibleByThree('100853') // false
        //divisibleByThree('33333333') // true
        //divisibleByThree('7') // false

        int[] array = {123, 8409, 100853, 33333333, 7};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0){
                System.out.println("divisible by three " + array[i] + "// true");
            } else {
                System.out.println("divisible by three " + array[i] + " // false");
            }
        }

        //Human readable duration format
        //Your task in order to complete this Kata is to write a function which formats a duration,
        // given as a number of seconds, in a human-friendly way.
        //The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise,
        // the duration is expressed as a combination of years, days, hours, minutes and seconds.
        //It is much easier to understand with an example:
        //TimeFormatter.formatDuration(62) //returns "1 minute and 2 seconds"
        //TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"

        int time = 3600;
        int second = 0;
        int minute = 0;
        int hour = 0;

        if (time == 0){
            System.out.println("now");
        }

        if (time >= 3600){
            hour = time / 3600;
            time = time % 3600;
            minute = time / 60;
            second = time % 60;
            System.out.println(hour + " hours, " + minute + " minutes and " + second + " seconds.");
        } else{
            minute = time / 60;
            second = time % 60;
            System.out.println( minute + " minutes and " + second + " seconds.");
        }

    }
}
