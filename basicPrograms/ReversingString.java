package basicPrograms;
import java.util.*;
public class ReversingString {

	public static void main(String[] args) {
		String str = "Hemanth";
		String rev = "";
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}System.out.println(rev);

	}

}
