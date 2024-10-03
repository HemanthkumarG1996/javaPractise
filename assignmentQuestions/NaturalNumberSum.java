package assignmentQuestions;
import java.util.*;

public class NaturalNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int sum = 0;
		sum = n*(n+1) / 2;
		System.out.println("The Sum of N natural numbers is :" + sum);

	}

}
