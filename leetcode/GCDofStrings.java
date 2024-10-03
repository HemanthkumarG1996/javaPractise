package leetcode;

public class GCDofStrings {

	public static void main(String[] args) {
		String s1 = "ABABAB";
		String s2 = "ABAB";
		if(!(s1+s2).equals(s2+s1)) {
			System.out.println("");
		}
		int gcd = gcd(s1.length(),s2.length());
		System.out.println(s2.substring(0,gcd));

	}public static int gcd(int n1,int n2){
		if(n2 == 0) {
			return n1;
		}return gcd(n2, n1%n2);
	}

}
