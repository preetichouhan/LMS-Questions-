package Day3;
import java.util.Arrays;

public class Day3_SubArray {

	    public static void main(String[] args) {
	        int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
	        int start = 2;
	        int end = 6;

	        // Get the subarray
	        int[] subArray = Arrays.copyOfRange(array, start, end);
	        System.out.println("Sub array: " + Arrays.toString(subArray));

	        // Find the 2nd highest number in the subarray
	        Arrays.sort(subArray);
	        int secondHighest = subArray[subArray.length - 2];
	        System.out.println("2nd Highest element: " + secondHighest);
	    }
	}