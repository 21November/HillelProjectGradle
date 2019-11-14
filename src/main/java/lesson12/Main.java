package lesson12;

public class Main {

    public static void main(String[] args) throws Exception {

//        //5 задача
//        try {
//            Student.deserialize(null);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            Main.task6();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Main.task7();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void task6() throws MyDomainException {
        try {
            Student.deserialize("");
        } catch (MyDomainException e) {
            System.out.println("ERROR");
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Задача 6. Выполнение при любом истечении обстоятельств");
        }
    }

    static void task7() {
        try {
            Student.deserialize("");
        } catch (Exception e) {
            throw new RuntimeException("ERROR", e);
        } finally {
            System.out.println("Задача 7. Выполнение при любом истечении обстоятельств");
        }
    }
}
