package lesson4.Task3;

import lesson4.Task3.CivilBuilding.ResidentialBuilding;
import lesson4.Task3.IndustrialBuilding.Energy;
import lesson4.Task3.IndustrialBuilding.Production;

public class Main {
    public static void main(String[] args) {
        ResidentialBuilding house1 = new ResidentialBuilding(5000.50, 1990, 21, "Sumska", 5, 100);
        Production factory1 = new Production(10000.0, 1980, 15, "Sillers", "Metal");
        Energy energy = new Energy(50000.1, 1999, 101, "Набережная", "ТЕЦ");


        System.out.println(house1.toString());  //Выводит поля всех наследуемых классов
        System.out.println(factory1.toString());//Выводит только поля класса Production
        System.out.println(energy.toString());  //Выводит поля класса Energy и Industrial,
                                                // площадь сооружения и год постройки остаются скрыты


    }
}
