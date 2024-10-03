package basicPrograms;
import java.util.Scanner;
public class ArmstrongUsingFunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int digits = numOfDigits(num);
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int digit = num % 10;
			sum = sum + power(digit, digits);
			num = num /10;
		}if(sum == temp) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
	static int numOfDigits(int n) {
		int temp = n;
		int count = 0;
		while(n!=0) {
			n = n /10;
			count++;
		}return count;
	}
	static int power(int x, int n) {
		int power = 1;
		for(int i = 0; i<n; i++) {
			power = power * x;
		}return power;
	}

}
