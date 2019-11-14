package lesson9;

import java.util.*;
//import java.util.Pair;


/**
 * Created by admin on 04.10.2019.
 */
public class ContactFunctional {

    public static Collection<Contact> find (Collection<Contact> contacts, String name){
        List<Contact> contactsNew = new ArrayList<Contact>();

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)){
                contactsNew.add(contact);
            }
        }

        return contactsNew;
    }

    public static Comparator<Pair<Contact, Integer>> getComparator() {
        return comparator;
    }

    public static void setComparator(Comparator<Pair<Contact, Integer>> comparator) {
        ContactFunctional.comparator = comparator;
    }

    public Map<Contact, List<CollLong>> toGroup (List<Contact> contacts, List<CollLong> collLongs){
        if (collLongs.size() == 0){
            System.out.println("Call book is empty!");
        }

        if (contacts.size() == 0){
            System.out.println("Contact book is empty!");
        }

        Map<Contact, List<CollLong>> map = new HashMap<Contact, List<CollLong>>();

        for (Contact contact : contacts){
            List<CollLong> collLongsContact = new ArrayList<CollLong>();
            for (CollLong collLong : collLongs){
                if (collLong.getForNumber().equals(contact.getForNumber())){
                    collLongsContact.add(collLong);
                    map.put(contact, collLongsContact);
                }
            }
        }
        return map;
    }




    public List<Pair<Contact, Integer>> topToGroup (List<Contact> contacts, List<CollLong> collLongs){

        List<Pair<Contact, Integer>> list = new ArrayList<>();
        Map<Contact,List<CollLong>> map = toGroup(contacts, collLongs);

        for (Contact contact : map.keySet()){
            Pair<Contact, Integer> pair = new Pair<>(contact, map.get(contact).size());
            list.add(pair);
        }
        list.sort(getComparator());
        return  list.size() >= 5 ? (List<Pair<Contact, Integer>>) list.subList(0, 5) : list;
    }



    private static Comparator<Pair<Contact, Integer>> comparator = new Comparator<Pair<Contact, Integer>>() {
        @Override
        public int compare(Pair<Contact, Integer> o1, Pair<Contact, Integer> o2) {
            return o2.getElement1().compareTo(o1.getElement1());
        }
    };




}
