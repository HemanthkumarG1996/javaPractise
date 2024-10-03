package assignmentQuestions;
import java.util.*;
public class SumofEvenNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The Sum of Even Natural Numbers is : " + sumOfEvenNumbers(n));

	}
	static int sumOfEvenNumbers(int n) {
		int sum = 0;
		for(int i =0;i<=n;i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}return sum;
	}
}
