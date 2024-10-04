package com.Day8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_CricketScoreMAp {

    public static void main(String[] args) {
        // Create a new HashMap to store cricketer names and scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add some cricketer names and scores to the map
        cricketerScores.put("Sachin Tendulkar", 100);
        cricketerScores.put("Virat Kohli", 80);
        cricketerScores.put("Rohit Sharma", 90);
        cricketerScores.put("MS Dhoni", 70);

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a batsman's name
        System.out.print("Enter a batsman's name: ");
        String batsmanName = scanner.nextLine();

        // Search for the batsman's name in the map
        if (cricketerScores.containsKey(batsmanName)) {
            int score = cricketerScores.get(batsmanName);
            System.out.println("The score of " + batsmanName + " is " + score);
        } else {
            System.out.println("Batsman not found in the map.");
        }
    }
}