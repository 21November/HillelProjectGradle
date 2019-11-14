package lesson9;

import java.util.Date;
import java.util.Random;

public class Factory {

    public Contact contactCreate (){

        String[] names = {"Adidas", "Julia","Halk", "Adam", "Sherlok"};
        String name = names[new Random().nextInt(names.length)];
        String[] numbers = {"123456789", "0505050505", "0404040404", "099099099", "101101101", "123", "101", "102", "103", "104"};
        String number = numbers[new Random().nextInt(numbers.length)];

        return new Contact(name, number);
    }

    public CollLong collLongCreate (){

        String[] numbers = {"123456789", "0505050505", "0404040404", "099099099", "101101101", "123", "101", "102", "103", "104"};
        String number = numbers[new Random().nextInt(numbers.length)];

        return new CollLong(number, new Date());
    }

    public Message messageCreate (){
        String[] numbers = {"123456789", "0505050505", "0404040404", "099099099", "101101101", "123", "101", "102", "103", "104"};
        String number = numbers[new Random().nextInt(numbers.length)];

        String[] messageTexts = {"I love you", "I kill you!", "CALL ME!!!", "SOS", "run Forest, run...", "I'm at home"};
        String messageText = messageTexts[new Random().nextInt(messageTexts.length)];

        return new Message(number, new Date(), messageText);
    }
}
