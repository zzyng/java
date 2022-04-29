package arrays;

public class Ex07 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 8, 2, 7, 6};
		
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
	}

}
