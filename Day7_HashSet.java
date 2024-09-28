package Day7;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Day7_HashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        String elementToAppend = "Date";

        // Add the element to the HashSet
        hashSet.add(elementToAppend);

        // Convert the HashSet to a List to maintain the order
        List<String> list = new ArrayList<>(hashSet);

        System.out.println("Elements in the list: " + list);
    }
}