package arrays;

public class Sortdesending {

	public static void main(String[] args) {
		int arr [] = {12,56,1,3,8,14,65};
		int temp;
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}System.out.print("The Desending order array is :");
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
