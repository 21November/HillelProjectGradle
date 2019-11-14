package lesson9;

import java.util.*;

import static lesson9.ContactFunctional.getComparator;

/**
 * Created by admin on 04.10.2019.
 */
public class MessageFunctional {


    public static Collection<Message> find (Collection<Message> messages, String number){
        List<Message> messagesNew = new ArrayList<Message>();

        for (Message message : messages) {
            if (message.getForNumber().equals(number)){
                messagesNew.add(message);
            }
        }

        return messagesNew;

    }

    public Map<Contact, List<Message>> toGroup (List<Contact> contacts, List<Message> messages){
        if (messages.size() == 0){
            System.out.println("Message book is empty!");
        }

        if (contacts.size() == 0){
            System.out.println("Contact book is empty!");
        }

        Map<Contact, List<Message>> map = new HashMap<Contact, List<Message>>();

        for (Contact contact : contacts){
            List<Message> messageList = new ArrayList<Message>();
            for (Message message : messages){
                if (message.getForNumber().equals(contact.getForNumber())){
                    messageList.add(message);
                    map.put(contact, messageList);
                }
            }
        }
        return map;
    }

    public List<Pair<Contact, Integer>> topToGroup (List<Contact> contacts, List<Message> messages){

        List<Pair<Contact, Integer>> list = new ArrayList<>();
        Map<Contact,List<Message>> map = toGroup(contacts, messages);

        for (Contact contact : map.keySet()){
            Pair<Contact, Integer> pair = new Pair<>(contact, map.get(contact).size());
            list.add(pair);
        }
        list.sort(getComparator());
        return list.size() >= 5 ? (List<Pair<Contact, Integer>>) list.subList(0, 5) : list;
    }
}
