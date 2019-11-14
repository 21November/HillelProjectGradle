package lesson4.Task3.IndustrialBuilding;

public class Energy extends Industrial {

    private int houseNumber;
    private String street;
    private String typeOfEnergyProduction;

    public Energy(double square, int yearOfConstruction, int houseNumber, String street, String typeOfEnergyProduction) {
        super(square, yearOfConstruction);
        this.houseNumber = houseNumber;
        this.street = street;
        this.typeOfEnergyProduction = typeOfEnergyProduction;
    }

    @Override
    public String toString() {
        return super.toString() + "Energy{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", typeOfEnergyProduction='" + typeOfEnergyProduction + '\'' +
                '}';
    }
}
