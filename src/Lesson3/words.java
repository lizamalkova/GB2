package Lesson3;

import java.util.*;

public class words {
    public static void main(String[] args) {
        ArrayList<String> arrayFruits = new ArrayList<>();
        arrayFruits.add("Apple");
        arrayFruits.add("Banana");
        arrayFruits.add("Peach");
        arrayFruits.add("Apple");
        arrayFruits.add("Lemon");
        arrayFruits.add("Lemon");
        arrayFruits.add("Pineapple");
        arrayFruits.add("Orange");
        arrayFruits.add("Grape");
        arrayFruits.add("Mandarin");
        arrayFruits.add("Banana");
        arrayFruits.add("Apricot");
        arrayFruits.add("Avocado");
        arrayFruits.add("Melon");

        Set<String> fruitsSet = new LinkedHashSet(arrayFruits);
        System.out.println("Уникальные слова: ");
        System.out.println(fruitsSet);

        HashMap<String, Integer> hashMapFruits = new HashMap();

        for ( String s : arrayFruits){
            hashMapFruits.put( s, hashMapFruits.getOrDefault(s,0)+1);
        }
        System.out.println(hashMapFruits);

    }
}
