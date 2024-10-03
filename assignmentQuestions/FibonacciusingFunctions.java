package assignmentQuestions;
import java.util.*;

public class FibonacciusingFunctions {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		System.out.println("The fibonacci series is :" + Arrays.toString(fibo(n)));
	}
	static int[] fibo(int n) {
		int fibo [] = new int[n];
		fibo[0] = 0;
		if(n > 1) {
			fibo[1] = 1;
			for(int i = 2; i<n;i++) {
				fibo[i] = fibo[i-1] + fibo[i-2];
			}
		}return fibo;
	}
}
