import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int pos = -1; // Initialize pos to -1 to indicate not found

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                pos = i;
                break; // Found the target, no need to continue searching
            }
        }

        if (pos != -1) {
            System.out.println("Index of target value: " + pos);
        } else {
            System.out.println("Target value not found");
        }
    }

}
