package basicPrograms;

public class Panagrams {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		boolean answer = Panagrams(s);
		System.out.println(answer);

	}static boolean Panagrams(String s) {
		s = s.toLowerCase(); // Convert the string to lowercase
        String result = s.replaceAll("[^a-z]", ""); // Remove non-alphabetic characters
        boolean[] attendance = new boolean[26]; // Array to track presence of each letter
        
        for (char c : result.toCharArray()) {
            attendance[c - 'a'] = true; // Mark the presence of each letter
        }
        
        for (boolean present : attendance) {
            if (!present) {
                return false; // If any letter is missing, return false
            }
        }
        return true;
	}

}
