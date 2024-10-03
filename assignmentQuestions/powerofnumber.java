package assignmentQuestions;
import java.util.*;
public class powerofnumber {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int n = sc.nextInt();
	        int pow= 1;
	        for(int i =1;i<=n;i++){
	            pow = pow*x;
	        }
	        System.out.println(pow);
	}

}
