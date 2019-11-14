package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 04.10.2019.
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Adidas", "123456789"));
        contacts.add(new Contact("Julia", "0505050505"));
        contacts.add(new Contact("Halk", "0404040404"));
        contacts.add(new Contact("Adam", "099099099"));
        contacts.add(new Contact("Sherlok", "101101101"));
        contacts.add(new Contact("Stiv", "123"));
        contacts.add(new Contact("Bel", "101"));
        contacts.add(new Contact("Juanna", "102"));
        contacts.add(new Contact("Tom", "103"));
        contacts.add(new Contact("Cat", "104"));

        List<CollLong> collLongs = new ArrayList<CollLong>();
        for (int i = 0; i < 100; i++){
            collLongs.add(factory.collLongCreate());
        }

        List<Message> messages = new ArrayList<Message>();
        for (int i = 0; i < 100; i++){
            messages.add(factory.messageCreate());
        }

        ContactFunctional contactFunctional = new ContactFunctional();

        System.out.println("Test CollLong");
        contactFunctional.toGroup(contacts, collLongs).forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("Test, TOP 5 Contact - CollLong");
        contactFunctional.topToGroup(contacts,collLongs).forEach((pair) -> System.out.println(pair.getElement0() + " : " + pair.getElement1()));

        MessageFunctional messageFunctional = new MessageFunctional();
        System.out.println("Test Message");
        messageFunctional.toGroup(contacts, messages).forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("Test, TOP 5 Contact - Message");
        messageFunctional.topToGroup(contacts, messages).forEach((pair) -> System.out.println(pair.getElement0() + " : " + pair.getElement1()));

    }
}
