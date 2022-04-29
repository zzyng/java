package arrays;

import java.util.Random;

public class Quiz9 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] arr1 = new int[5][5];

		int n1 = 1;
		char n2 = 'A';
//		0~9
		for (int i = 0 ; i < arr1.length ; i++ )
		{
			for (int j = 0 ; j < arr1[i].length ; j++ )
			{
				arr1[i][j] = n1;
				n1++;
				arr1[i][j] = r.nextInt(10);
			}
		}

		for (int i=0; i<arr1.length;i++ )
		{
			for (int j=0; j<arr1[i].length;j++ )
			{
				System.out.printf(" " + arr1[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < arr1.length ; i++ )
		{
			for (int j = 0 ; j < arr1[i].length ; j++ )
			{
				arr1[i][j] = n1;
				n1++;
				arr1[i][j] = r.nextInt(26) + 97;
			}
		}
		
		for (int i=0; i<arr1.length;i++ )
		{
			for (int j=0; j<arr1[i].length;j++ )
			{
				System.out.printf(" " + (char)arr1[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
