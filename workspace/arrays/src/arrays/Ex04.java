package arrays;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(i + "번째 입력 :");
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < arr.length ; i++) 
			System.out.println("arr[" + i + "] : " + arr[i]);
	}

}
