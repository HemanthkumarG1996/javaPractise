package arrays;

public class Largestelement {

	public static void main(String[] args) {
		int arr [] = {89,12,45,16,35,98,2,4,8};
		int largest = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					largest = arr[i];
				}
			}
		}System.out.println("The Largest Element is :" + largest);

	}

}
