package arrays;
import java.util.*;

public class ShuffleArray {

	public static void main(String[] args) {
		int nums[] = {2,5,1,3,4,7};
		int res [] = shuffle(nums);
		System.out.println(Arrays.toString(res));

	}
	static int[] shuffle(int nums[]){
		int len = nums.length /2;
		int res [] = new int[nums.length];
		int index = 0;
		for(int i =0; i<len; i++) {
			res[index++] = nums[i];
			res[index++] = nums[i+len];
		}return res;
	}

}
