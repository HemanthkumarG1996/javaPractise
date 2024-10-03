package basicPrograms;
import java.util.*;
// Leetcode 1528. Shuffle String

public class shuffleString {

	public static void main(String[] args) {
		String s = "codeleet";
		int indices [] = {4,5,6,7,0,2,1,3};
		char shuffled []= new char[s.length()];
		for(int i =0; i< s.length(); i++) {
			shuffled[indices[i]] = s.charAt(i);
		}
		System.out.println(shuffled);
	}

}
