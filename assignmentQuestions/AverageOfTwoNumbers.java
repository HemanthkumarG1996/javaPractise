package assignmentQuestions;
import java.util.*;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int avg = (num1 + num2)/2;
		System.out.println("The Average of the two numbers is : " + avg);

	}

}
