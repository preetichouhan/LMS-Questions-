package Day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day6_ReverseList {

    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");

        System.out.println("Original List: " + stringList);

        // Reverse the List
        Collections.reverse(stringList);

        System.out.println("Reversed List: " + stringList);
    }
}