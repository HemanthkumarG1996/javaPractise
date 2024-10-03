package assignmentQuestions;

//Print the Inverted Right Triangle Star Pattern for the given value of N.
//
//Input 1: N = 4
//Output 1:
//****
//***
//**
//*

public class pattern5 {

	public static void main(String[] args) {
		int n = 4;
		for(int i =0; i<=n;i++) {
			for(int j =0; j<=n-i-1; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
