package assignmentQuestions;
import java.util.*;

public class MultipleofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int multiple = sc.nextInt();
		if(num % multiple == 0) {
			System.out.println("It is multiple of a number");
		}else {
			System.out.println("It is not a multiple of a number");
		}
	}

}
