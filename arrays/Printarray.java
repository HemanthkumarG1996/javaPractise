package arrays;
import java.util.Scanner;

public class Printarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int arr [] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is :");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
