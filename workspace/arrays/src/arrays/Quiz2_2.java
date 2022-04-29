package arrays;

import java.util.Scanner;

public class Quiz2_2 {
	
	public static int inputCheck(String subject) {
		Scanner in =  new Scanner(System.in);
		while(true) {
			System.out.print(subject + " 점수 : "); 
			int tmp = in.nextInt();
			if(tmp >= 0 && tmp <= 100)
				return tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] scores = new int[4];
			
		scores[0] = inputCheck("국어");
		scores[1] = inputCheck("영어");
		scores[2] = inputCheck("수학");
		
		scores[3] = scores[0] + scores[1] + scores[2];
		System.out.println("총점 : " + scores[3]);
		double average = scores[3] / 3.0;
		System.out.printf("평균 : %.2f", average);
	
	}
}













