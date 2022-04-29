package arrays;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1 = new int[15];
		int[][] arr2 = new int [3][5]; //같은 15이지만 시점이 다르다.
		
		for(int i = 0 ; i < arr1.length ; i++)
			arr1[i] = i + 1;
		
		for(int i = 0; i < arr1.length ; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		
		arr2[0][4] = 4;
		arr2[1][0] = 10;
		arr2[2][3] = 23;
		int data = 1;
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length; j++) {
				arr2[i][j] = data++;
			}
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " \t");
			}
				System.out.println();
	}
		
	}
}
