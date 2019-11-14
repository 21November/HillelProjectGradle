package lesson4.Task3.CivilBuilding;

public class ResidentialBuilding extends Civil {

    private int houseNumber;
    private String street;
    private int numberOfFloors;
    private int numberOfApartments;

    public ResidentialBuilding(double square, int yearOfConstruction, int houseNumber, String street, int numberOfFloors, int numberOfApartments) {
        super(square, yearOfConstruction);
        this.houseNumber = houseNumber;
        this.street = street;
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartments = numberOfApartments;
    }

    @Override
    public String toString() {
        return super.toString() + "ResidentialBuilding{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfApartments=" + numberOfApartments +
                '}';
    }
}
