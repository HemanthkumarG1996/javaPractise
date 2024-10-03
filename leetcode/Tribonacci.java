package leetcode;
import java.util.*;
public class Tribonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int res = tribo(n);
		System.out.println(res);

	}static int tribo(int n) {
		int tri[] = new int[n+1];
		tri[0] = 0;
		tri[1] = 1;
		tri[2] = 1;
		for(int i = 3; i<=n;i++) {
			tri[i] = tri[i-1] + tri[i-2] + tri[i-3];
		}return tri[n];
	}

}
