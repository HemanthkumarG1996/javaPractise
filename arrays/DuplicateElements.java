package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr [] = {9,8,1,2,1,9,2,3,4,3,8};
		System.out.println("The Duplicate Elements are :");
		for(int i =0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j]);
				}
			}
		}
	}

}
