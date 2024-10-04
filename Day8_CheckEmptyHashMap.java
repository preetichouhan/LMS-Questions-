package com.Day8;
import java.util.HashMap;

public class Day8_CheckEmptyHashMap {
	
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Add some key-value mappings to the HashMap
        map.put("John", 25);
        map.put("Alice", 30);

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}