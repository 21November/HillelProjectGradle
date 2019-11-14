package lesson4.Task3.IndustrialBuilding;

public class Production extends Industrial {

    private int houseNumber;
    private String street;
    private String typeOfProduction;

    public Production(double square, int yearOfConstruction, int houseNumber, String street, String typeOfProduction) {
        super(square, yearOfConstruction);
        this.houseNumber = houseNumber;
        this.street = street;
        this.typeOfProduction = typeOfProduction;
    }

    @Override
    public String toString() {
        return "Production{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", typeOfProduction='" + typeOfProduction + '\'' +
                '}';
    }
}
