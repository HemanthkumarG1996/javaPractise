package assignmentQuestions;

//Print the Hollow Square Star Pattern for the given value of N.
//Input 1: N = 4
//Output 1:
//****
//*__*
//*__*
//****

public class pattern6 {

	public static void main(String[] args) {
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				if( i == 0 || i == n-1 || j == 0 || j == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
