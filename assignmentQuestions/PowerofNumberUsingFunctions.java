package assignmentQuestions;
import java.util.*;

public class PowerofNumberUsingFunctions {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		System.out.println("The Power of two numbers is : " + Power(x,n));
	}
	static int Power(int x, int n) {
		int pow = 1;
		for(int i =1; i<=n; i++) {
			pow = pow * x;
		}return pow;
	}
}
