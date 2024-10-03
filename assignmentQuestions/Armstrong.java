package assignmentQuestions;
import java.util.*;
import java.lang.*;
public class Armstrong { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println("Is Armstrong Number : " + Armstrong(num) );
	}
	static boolean Armstrong(int n) {
		int digit = 0;
		int temp = n;
		int sum = 0;
		while(temp != 0) {
			temp = temp /10;
			digit ++;
		}
		System.out.println("The Number of digits is : " + digit);
		temp = n;
		while(temp != 0) {
			int digits = temp % 10;
			sum = (int) (sum +Math.pow(digits , digit));
			temp = temp / 10;
		}
		if(sum == n) {
			return true;
		} else {
			return false;
		}
	}
}
