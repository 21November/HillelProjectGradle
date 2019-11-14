package lesson4.Task4;

public class Tree extends Plants {

    private String typeOfFoliage;
    private int age;

    public Tree(String name, String breedingType, int numberOfTrunks, String typeOfFoliage, int age) {
        super(name, breedingType, numberOfTrunks);
        this.typeOfFoliage = typeOfFoliage;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Tree{" +
                "typeOfFoliage='" + typeOfFoliage + '\'' +
                ", age=" + age +
                '}';
    }
}
