package com.Day9;
import java.util.TreeMap;

public class Day9_RemoveEntryFromTreeMap {

	    public static void main(String[] args) {
	        // Create a TreeMap and add some entries
	        TreeMap<String, Integer> treeMap = new TreeMap<>();
	        treeMap.put("One", 1);
	        treeMap.put("Three", 3);
	        treeMap.put("Two", 2);
	        
	        System.out.println("Original TreeMap: " + treeMap);
	        
	        // Key to remove
	        String keyToRemove = "Two";
	        
	        // Remove the entry associated with the specified key
	        Integer removedValue = treeMap.remove(keyToRemove);
	        
	        // Output the removed value
	        System.out.println("Removed value = " + removedValue);
	        
	        // Check if the entry {Three=3} is removed
	        boolean isThreeRemoved = !treeMap.containsKey("Three");
	        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);
	        
	        // Output the updated TreeMap
	        System.out.println("Updated TreeMap: " + treeMap);
	    }
	}
