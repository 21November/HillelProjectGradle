package lesson4.Task4;

public class Plants {
    private String name;
    private String breedingType;
    private int numberOfTrunks;

    public Plants(String name, String breedingType, int numberOfTrunks) {
        this.name = name;
        this.breedingType = breedingType;
        this.numberOfTrunks = numberOfTrunks;
    }

    public String getName() {
        return name;
    }

    public String getBreedingType() {
        return breedingType;
    }

    public int getNumberOfTrunks() {
        return numberOfTrunks;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "name='" + name + '\'' +
                ", breedingType='" + breedingType + '\'' +
                ", numberOfTrunks=" + numberOfTrunks +
                '}';
    }
}
