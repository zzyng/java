package arrays;

import java.util.Random;

public class Quiz10 {
	
	public static void main(String[] args) {
	
	Random r = new Random();
	int[][] arr1 = new int[5][6];

	for (int i = 0 ; i < arr1.length ; i++ ) {
		for (int j = 0 ; j < arr1[i].length ; j++ ){
			arr1[i][j] = r.nextInt(45) + 1;
			for(int k = 0 ; k < j ; k++ ) {
			if(arr1[i][j] == arr1[i][k]) {
				j--;
				break;
				}
			}
		}
	}

	for (int i = 0 ; i < arr1.length ; i++ ) {
		for (int j = 0 ; j < arr1[i].length ; j++ ) {
			for(int k = j + 1 ; k < arr1[i].length; k++) {
				if(arr1[i][j] > arr1[i][k]) {
					int tmp = arr1[i][j];
					arr1[i][j] = arr1[i][k];
					arr1[i][k] = tmp;
				}
			}
		}			
	}	
	
	for(int i = 0 ; i < arr1.length ; i++) {
		for(int j = 0 ; j < arr1[i].length ; j++) {
			System.out.print(arr1[i][j] + "\t");
		}
		System.out.println();
	}
			

	}
}