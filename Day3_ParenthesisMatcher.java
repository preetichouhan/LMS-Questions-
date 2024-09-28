package Day3;

public class Day3_ParenthesisMatcher {

	    public static int matchParenthesis(String sentence, int openingPosition) {
	        /**
	         * Find the corresponding closing parenthesis for a given opening parenthesis position
	         */
	        int count = 0;
	        for (int i = openingPosition; i < sentence.length(); i++) {
	            char c = sentence.charAt(i);
	            if (c == '(') {
	                count++;
	            } else if (c == ')') {
	                count--;
	                if (count == 0) {
	                    return i;  // return the position of the closing parenthesis
	                }
	            }
	        }
	        return -1;  // return -1 if no matching closing parenthesis is found
	    }

	    public static void main(String[] args) {
	        String sentence = "Sometimes (when me nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
	        int openingPosition = 10;
	        int result = matchParenthesis(sentence, openingPosition);
	        System.out.println("The corresponding closing parenthesis is at position " + result);
	    }
	}