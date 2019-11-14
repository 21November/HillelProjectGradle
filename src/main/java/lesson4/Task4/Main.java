package lesson4.Task4;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree("Дуб", "корневая", 1, "листва", 50);
        Grass grass = new Grass("подорожник", "корневая", 0);
        FloweringPlants floweringPlants = new FloweringPlants("Роза", "корневая", 5, "красный", 2);

        System.out.println(tree.toString());
        System.out.println(grass.toString());
        System.out.println(floweringPlants.toString());
        System.out.println(floweringPlants.toString1());
    }
}
