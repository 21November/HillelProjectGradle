package lesson4.Task3.CivilBuilding;

public class SocialBuilding extends Civil {

    private int houseNumber;
    private String street;
    private int numberOfFloors;
    private String type;

    public SocialBuilding(double square, int yearOfConstruction, int houseNumber, String street, int numberOfFloors, String type) {
        super(square, yearOfConstruction);
        this.houseNumber = houseNumber;
        this.street = street;
        this.numberOfFloors = numberOfFloors;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "SocialBuilding{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", type='" + type + '\'' +
                '}';
    }
}
