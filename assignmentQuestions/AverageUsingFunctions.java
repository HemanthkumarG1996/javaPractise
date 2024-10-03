package assignmentQuestions;
import java.util.*;
public class AverageUsingFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("The Average of Two Numbers is : " + Average(num1,num2));

	}
	static int Average(int n1 , int n2) {
		int avg = (n1 + n2)/2;
		return avg;
	}
}
