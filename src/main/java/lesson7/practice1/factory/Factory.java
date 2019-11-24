package lesson7.practice1.factory;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Factory {

    private static Random random = new Random();
    private static String[] femaleNames = new String[]{
            "Emma", "Ava", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn",
            "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett",
            "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora"};
    private static String[] maleNames = new String[]{
            "Liam", "Noah", "William", "James", "Oliver", "Benjamin", "Elijah", "Lucas", "Mason", "Logan",
            "Alexander", "Ethan", "Jacob", "Michael", "Daniel", "Henry", "Jackson", "Sebastian", "Aiden",
            "Matthew", "Samuel", "David", "Joseph", "Carter", "Owen", "Wyatt", "John", "Jack", "Luke"};
    private static String[] words = new String[]{
            "Area", "Book", "business", "case", "child", "company", "country", "day", "eye", "fact", "family",
            "government", "group", "hand", "home", "job", "life", "lot", "man", "money", "month", "mother", "Mr",
            "night", "number", "part", "people", "place", "point", "problem", "program", "question", "right", "room",
            "school", "state", "story", "student", "study", "system", "thing", "time", "water", "way", "week", "woman",
            "word", "work", "world", "year"};

    // Обьявление енама с полами для персон
    public enum Gender {
        FEMALE, MALE;
    }
    //Генерация случайнных чисел в пределах min и max
    public static int randomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }
    //генерация случайного логического значения
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }
    //Генерация случайной даты. начиная от 1970
    public static LocalDate getDate() {
        int year = randomInt(1970, LocalDate.now().getYear());
        int dayOfYear = randomInt(1, Year.isLeap(year) ? 366 : 365);
        return LocalDate.ofYearDay(year, dayOfYear);
    }
    //Генерация случайного пола персоны, через метод генерации случайного логического значения
    public static Gender getGender() {
        return randomBoolean() ? Gender.FEMALE : Gender.MALE;
    }
    //Генерация имени персоны в зависимости от пола
    public static String getName(Gender gender) {
        if (gender == Gender.MALE){
            return maleNames[randomInt(0, maleNames.length - 1)];
        } else {
            return femaleNames[randomInt(0, femaleNames.length - 1)];
        }
    }
    //Генерация случайных слов
    public static String getSomeWords(int max) {
        int number = randomInt(1, max);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            builder.append(words[randomInt(0, words.length - 1)])
                    .append(" ");
        }
        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
    }
    //Определяет количество дней между датами
    public static int getDaysBetween(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
