package lesson4.Task3;

public class Building {

    private double square;
    private int yearOfConstruction;

    public Building(double square, int yearOfConstruction) {
        this.square = square;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Building{" +
                "square=" + square +
                ", yearOfConstruction=" + yearOfConstruction +
                '}';
    }
}
