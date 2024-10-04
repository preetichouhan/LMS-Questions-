package com.Day8;
import java.util.HashMap;
public class Day8_HashMapExample {

    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Specify the key and value
        String key = "John";
        int value = 25;

        // Associate the value with the key in the HashMap
        map.put(key, value);

        // Print the HashMap to verify the association
        System.out.println("HashMap: " + map);
    }
}