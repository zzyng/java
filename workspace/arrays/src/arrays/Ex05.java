package arrays;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] names = new String[3];
		
		for (int i = 0; i < names.length ; i++) {
			System.out.print(i + "번째 입력 :");
			names[i] = in.next();
		}
		for(int i = 0 ; i < names.length ; i++) 
			System.out.println("arr[" + i + "] : " + names[i]);
	}

}
