package com.Day9;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public class Day9_NavigateTreeMAp {

	    public static void main(String[] args) {
	        // Create a TreeMap and add some entries
	        TreeMap<String, Integer> treeMap = new TreeMap<>();
	        treeMap.put("One", 1);
	        treeMap.put("Three", 3);
	        treeMap.put("Two", 2);
	        treeMap.put("Four", 4);
	        
	        System.out.println("Original TreeMap: " + treeMap);

	        // 1. Using for-each loop with entrySet()
	        System.out.println("\nUsing entrySet():");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        // 2. Using for-each loop with keySet()
	        System.out.println("\nUsing keySet():");
	        for (String key : treeMap.keySet()) {
	            System.out.println(key + " = " + treeMap.get(key));
	        }

	        // 3. Using forEach method (Java 8 and above)
	        System.out.println("\nUsing forEach:");
	        treeMap.forEach((key, value) -> {
	            System.out.println(key + " = " + value);
	        });

	        // 4. Using Iterator
	        System.out.println("\nUsing Iterator:");
	        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<String, Integer> entry = iterator.next();
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        // 5. Using Streams (Java 8 and above)
	        System.out.println("\nUsing Streams:");
	        treeMap.entrySet().stream()
	                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
	    }
	}
