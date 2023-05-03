package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ziaul", "Java");
        hashMap.put("Monjure", "Python");
        hashMap.put("Mafijul", "Http");
        hashMap.put("Lina", "Kotlin");

//        System.out.println(hashMap);

        hashMap.put("Monjure", "All");

//        System.out.println(hashMap);

//        if (hashMap.containsKey("Lina")) {
//            System.out.println("Key is Present");
//        }
//        else {
//            System.out.println("Key is not present");
//        }
//
//        System.out.println(hashMap.get("Lina"));
//        System.out.println(hashMap.get("Sagar"));

//        int [] arr = {10,25,14,36};
//
//        for (int i : arr){
//            System.out.print(" " + i);
//        }
        for (Map.Entry<String, String> i : hashMap.entrySet()) {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
    }
}
