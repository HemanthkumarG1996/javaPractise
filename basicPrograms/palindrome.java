package basicPrograms;
import java.util.*;
public class palindrome {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		String original;
		String reverse = "";
		System.out.println("Enter the String :");
		original = sc.nextLine();
		int length = original.length();
		for(int i = length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println(original + " " + "is a palindrome");
		}else {
			System.out.println(original + " " + "is not a palindrome");
		}
	}
}
