package lesson3.TrainingRoom;

import java.util.Random;

public class AudienceFactory {

    public Audience audienceCreate (){

        double numberRoomD = 100 +  Math.random() * 100;
        int numberRoom = (int) numberRoomD;
        double numberOfSeatsD = 10 +  Math.random() * 5;
        int numberOfSeats = (int) numberOfSeatsD;
        String[] audienceNames = {"Chemistry", "Maths", "Physics", "History", "Programming", "English", "Psychology"};
        String audienceName = audienceNames[new Random().nextInt(audienceNames.length)];

        Audience audience = new Audience(numberRoom, numberOfSeats, audienceName);
        return audience;
    }
}
