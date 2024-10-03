package basicPrograms;
import java.util.Scanner;
public class reverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String original = sc.nextLine();
		String reverse = "";
		int length = original.length();
		for(int i = length -1; i>= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Original String is :" + " " +original);
		System.out.println("Reverse String is :" + " " +reverse);
	}
}
