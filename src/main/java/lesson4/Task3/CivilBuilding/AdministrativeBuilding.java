package lesson4.Task3.CivilBuilding;

public class AdministrativeBuilding extends Civil {

    private String name;
    private int houseNumber;
    private String street;
    private int numberOfFloors;

    public AdministrativeBuilding(double square, int yearOfConstruction, String name1, int houseNumber, String street, int numberOfFloors) {
        super(square, yearOfConstruction);
        this.name = name1;
        this.houseNumber = houseNumber;
        this.street = street;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() +  "AdministrativeBuilding{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
