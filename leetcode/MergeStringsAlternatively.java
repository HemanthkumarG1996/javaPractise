package leetcode;
import java.util.*;
public class MergeStringsAlternatively {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings : ");;
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String ans = MergeStrings(s1,s2);
		System.out.println(ans);;

	}static String MergeStrings(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		int n1 = s1.length();
		int n2 = s2.length();
		while(i<n1 || i<n2) {
			if(i<n1) {
				sb.append(s1.charAt(i));
			}
			if(i<n2) {
				sb.append(s2.charAt(i));
			}
			i++;
		}return sb.toString();
	}

}
