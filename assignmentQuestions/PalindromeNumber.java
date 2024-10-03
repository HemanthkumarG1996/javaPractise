package assignmentQuestions;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		int last;
		while(num > 0) {
			last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}if(temp == rev) {
			System.out.println("The number is Palindrome");
		}else {
			System.out.println("The Number is Not a Palindrome");
		}
	}

}
