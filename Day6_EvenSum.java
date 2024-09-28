package Day6;
import java.util.ArrayList;
public class Day6_EvenSum {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);

        System.out.println("Original List: " + numberList);

        // Calculate the sum of even numbers
        int evenSum = 0;
        for (int number : numberList) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
    }
}