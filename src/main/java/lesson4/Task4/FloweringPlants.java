package lesson4.Task4;

public class FloweringPlants extends Plants{

    private String floweringColor;
    private int numberOfBloomsPerYear;

    public FloweringPlants(String name, String breedingType, int numberOfTrunks, String floweringColor, int numberOfBloomsPerYear) {
        super(name, breedingType, numberOfTrunks);
        this.floweringColor = floweringColor;
        this.numberOfBloomsPerYear = numberOfBloomsPerYear;
    }

    @Override
    public String toString() {
        return "FloweringPlants{" + "name='" + super.getName() + '\'' +
                ", breedingType='" + super.getBreedingType() + '\'' +
                ", numberOfTrunks=" + super.getNumberOfTrunks() + '\'' +
                ", floweringColor='" + floweringColor + '\'' +
                ", numberOfBloomsPerYear=" + numberOfBloomsPerYear +
                '}';
    }

    public String toString1() {
        return "FloweringPlants{" +
                "floweringColor='" + floweringColor + '\'' +
                ", numberOfBloomsPerYear=" + numberOfBloomsPerYear +
                '}';
    }
}
