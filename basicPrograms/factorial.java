package basicPrograms;
import java.util.*;


public class factorial {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to calculate");
	int n = sc.nextInt();
	int i;
	int fact =1;
	for(i = 1; i<=n ; i++) {
		fact = fact*i;
	}System.out.println(fact);
}
}
