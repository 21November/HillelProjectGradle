package lesson3.TrainingRoom;

public class Audience {
   private int numberRoom;
   private int numberOfSeats;
   private String audienceName;

    public Audience(int numberRoom, int numberOfSeats, String audienceName) {
        this.numberRoom = numberRoom;
        this.numberOfSeats = numberOfSeats;
        this.audienceName = audienceName;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getAudienceName() {
        return audienceName;
    }
}
