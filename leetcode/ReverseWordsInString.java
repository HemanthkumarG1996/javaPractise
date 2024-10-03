package leetcode;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = " the  sky  is blue  ";
		System.out.println(reverse(s));

	}static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		String words[] = s.trim().split("\\s+");
		for(int i = words.length-1;i>=0; i--) {
			sb.append(words[i]);
			if(i>0) {
				sb.append(" ");
			}
		}return sb.toString();
	}

}
