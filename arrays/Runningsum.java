package arrays;
import java.util.*;

//Question:
//	Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.
//
//	Input 1: nums = [1,2,3,4]
//	Output 1: [1,3,6,10]
//	Explanation 1: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class Runningsum {

	public static void main(String[] args) {
		int nums [] = {1,3,5,7,9};
		int ans [] = runningsum(nums);
		System.out.println(Arrays.toString(ans));
	}
	static int [] runningsum(int [] nums) {
		int n = nums.length;
		int ans[] = new int[n];
		ans[0] = nums[0];
		for(int i=1; i<n;i++) {
			ans[i] = nums[i-1] + nums[i];
		}return ans;
	}

}
