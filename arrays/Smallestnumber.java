package arrays;

public class Smallestnumber {

	public static void main(String[] args) {
		int arr []= {12,35,76,13,5,9,2,3,7,1};
		int small = 0;
		for(int i =0;i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					small = arr[i];
				}
			}
		}System.out.println("The smallest elemt is :" + " " +small);

	}

}
