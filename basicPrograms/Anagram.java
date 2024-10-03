package basicPrograms;
import java.util.*;

public class Anagram {
	public static void main(String args[]) {
		String s1 = "hemanth";
		String s2 = "hhtenma";
		System.out.println(anagrams(s1,s2));
	}
	static boolean anagrams(String s1 , String s2) {
		int len = s1.length();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1,ch2);
	}
}
