package assignmentQuestions;

//Print the Number Series Pattern for the given value of N.
//
//Input 1: N = 4
//Output 1:
//1
//12
//123
//1234

public class pattern4 {

	public static void main(String[] args) {
		int n = 4;
		for(int i =0; i<=n ; i++) {
			for(int j =0; j<i; j++) {
				System.out.print(j+1);
			}System.out.println();
		}
	}

}
