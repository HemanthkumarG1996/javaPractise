package patterns;
import java.util.*;

//Pattern1:
//	00 01 02 03 04
//	10 11 12 13 14
//	20 21 22 23 24
//	30 31 32 33 34
//	40 41 42 43 44

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :" );
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(i + "" + j + " ");
			}System.out.println();
		}
	}

}
