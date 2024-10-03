package leetcode;
import java.util.*;
public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		int candies [] = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> result = maxCandies(candies,extraCandies);
		System.out.println(result);
	}
	static List<Boolean> maxCandies (int candies[], int extraCandies){
		int max = 0;
		for(int i : candies) {
			if(i>max) {
				max = i;
			}
		}
		List<Boolean> res = new ArrayList();
		for(int i : candies) {
			if(i + extraCandies >= max) {
				res.add(true);
			}else {
				res.add(false);
			}
		}return res;
	}

}
