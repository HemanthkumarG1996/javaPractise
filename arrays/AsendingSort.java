package arrays;
import java.util.*;
public class AsendingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = {12,15,2,1,9,3,8};
		int temp;
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
