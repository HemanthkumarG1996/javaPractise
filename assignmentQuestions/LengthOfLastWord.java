package assignmentQuestions;
import java.util.*;

public class LengthOfLastWord {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println("The length of the last string is : " + StringLength(s));
	}
	static int StringLength(String s) {
		 int length = 0;
	        boolean wordFound = false;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) != ' ') {
	                length++;
	                wordFound = true;
	            } else if (wordFound) {
	                break; // Found a space after the word
	            }
	        }

	        return length;
	}
}
