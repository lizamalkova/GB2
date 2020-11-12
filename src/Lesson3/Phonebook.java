package Lesson3;
import java.util.*;

public class Phonebook {
    private Map<Integer, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(int number, String name) {
        phonebook.put(number, name);
    }

    public void get(String name){
        if(phonebook.containsValue(name)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> pb : set) {
                if(pb.getValue().equals(name)) {
                    System.out.println(pb.getValue() + " : " + pb.getKey());
                }
            }
        } else {
            System.out.println("Такого имени нет в списке!");
        }
    }
}
