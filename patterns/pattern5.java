package patterns;
import java.util.Scanner;

//Pattern 5:
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5

public class pattern5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i = 0; i<=n; i++) {
				for(int j =1; j<i+1; j++) {
					System.out.print(i + " ");
				}System.out.println();
			}

		}

	}


