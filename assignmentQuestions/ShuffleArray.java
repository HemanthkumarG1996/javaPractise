package assignmentQuestions;
import java.util.*;

//Question:
//	Given the array nums consisting of n(n will be even) elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//	Input 1: nums = [2,5,1,3,4,7]
//	Output 1: [2,3,5,4,1,7]
//	Explanation 1: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

public class ShuffleArray {

	public static void main(String[] args) {
		int nums [] = {2,5,1,3,4,7};
		int ans [] = Shuffle(nums);
		System.out.println(Arrays.toString(ans));

	}
	static int [] Shuffle(int nums[]) {
		int n = nums.length /2;
		int res[] = new int[nums.length];
		int index =0;
		for(int i =0; i<n; i++) {
			res[index++] = nums[i];
			res[index++] = nums[i + n];
		}
			return res;
	}

}
