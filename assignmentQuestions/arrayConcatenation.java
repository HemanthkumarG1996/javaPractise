package assignmentQuestions;
import java.util.*;

//Question:
//	Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//	Specifically, ans is the concatenation of two nums arrays.
//
//	Return the array ans.

public class arrayConcatenation {

	public static void main(String[] args) {
		int nums[] = {3,2,1};
		int ans[] = concat(nums);
		System.out.println(Arrays.toString(ans));

	}static int[] concat(int nums[]) {
		int len = nums.length;
		int ans [] = new int[2*len];
		for(int i =0; i<len; i++) {
			ans[i] = nums[i];
			ans[i+len] = nums[i];
		}return ans;
	}

}
