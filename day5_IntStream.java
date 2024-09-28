package Day5;

public class day5_IntStream {

	    public static void main(String[] args) {
	        // Create an array from 1 to 100
	        int[] array = new int[100];
	        for (int i = 0; i < 100; i++) {
	            array[i] = i + 1;
	        }

	        // Print the array elements
	        for (int element : array) {
	            System.out.println(element);
	        }
	    }
	}
