package basicPrograms;
import java.util.*;
public class VowelCheck {

	public static void main(String[] args) {
		String s = "wrtyp";
		System.out.println(VowelCheck(s));
	}
	static boolean VowelCheck(String s) {
		int len = s.length();
		char ch[] = s.toCharArray(); 
		for(int i = 0; i<len; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ) {
				return true;
			}
		}return false;
	}

}
