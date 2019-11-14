package lesson4.Task3.CivilBuilding;

import lesson4.Task3.Building;

public class Civil extends Building {
    private final String type = "CIVIL BUILDING";

    public Civil(double square, int yearOfConstruction) {
        super(square, yearOfConstruction);
    }

    @Override
    public String toString() {
        return super.toString() + "Civil{" +
                "tupe='" + type + '\'' +
                '}';
    }
}
