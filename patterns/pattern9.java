package patterns;
import java.util.Scanner;

//Pattern9:
//	*
//	**
//	***
//	****
//	*****
//	****
//	***
//	**
//	*


public class pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =0; i<2*n-1; i++) {
			int stars = i+1;
			if(i>=n) {
				stars = 2*n-1-i;
			}for(int j =0;j<stars; j++) {
				System.out.print("*");
			}System.out.println();
			
		}

	}

}
