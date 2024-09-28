package Day5;

public class day5_ArrayIndexOutOfBoundsExceptionExample {


    public static void main(String[] args) {
        // Declare and initialize an array
        int[] array = {1, 2, 3, 4, 5};

        // Try to access elements in the array
        for (int i = 0; i <= array.length; i++) {
            System.out.println("Element at index " + i + " is: " + array[i]);
        }
    }
}
