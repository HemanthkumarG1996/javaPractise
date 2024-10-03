package assignmentQuestions;
import java.util.*;

public class EligibleDriver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of Driver :");
		int n = sc.nextInt();
		System.out.println("Eligiblity of Driver : " + EligiblityCheck(n));
	}
	static boolean EligiblityCheck(int n) {
		if(n >= 18) {
			return true;
		}else {
			return false;
		}
	}
}
