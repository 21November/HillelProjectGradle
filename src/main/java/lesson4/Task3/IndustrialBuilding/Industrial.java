package lesson4.Task3.IndustrialBuilding;

import lesson4.Task3.Building;

public class Industrial extends Building {
    private final String type = "INDUSTRIAL BUILDING";

    public Industrial(double square, int yearOfConstruction) {
        super(square, yearOfConstruction);
    }

    @Override
    public String toString() {
        return  "Industrial{" +
                "tupe='" + type + '\'' +
                '}';
    }
}
