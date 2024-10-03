package leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Countbits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int ans[] = new int[n +1];
		ans[0] = 0;
		for(int i =1; i<=n;i++) {
			String binary = Integer.toBinaryString(i);
			int count = countOnes(binary);
			ans[i] = count;
		}System.out.println(Arrays.toString(ans));
	}
	static int countOnes(String num) {
		int count = 0;
		for(int i=0; i<num.length(); i++) {
			if(num.charAt(i) == '1') {
				count++;
			}
		}return count;
	}

}
