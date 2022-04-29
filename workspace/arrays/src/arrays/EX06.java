package arrays;

import java.util.Scanner;

public class EX06 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] arr = new double[3];
		
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(i + "번째 입력 :");
			arr[i] = in.nextDouble();
		}
		for(int i = 0 ; i < arr.length ; i++) 
			System.out.println("arr[" + i + "] : " + arr[i]);
	}

}
