package basicPrograms;
import java.util.*;

public class SortingStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(int i =0; i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}
