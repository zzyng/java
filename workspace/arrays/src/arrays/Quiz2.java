package arrays;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] st = new int[4];
		
		while(true) {
			System.out.println("국어 점수 : ");
			st[0] = sc.nextInt();
			if(st[0] >= 0 && st[0] <= 100)
				break;
		}
		while(true) {
			System.out.println("영어 점수 : ");
			st[0] = sc.nextInt();
			if(st[1] >= 0 && st[1] <= 100)
				break;
		}
		while(true) {
			System.out.println("수학 점수 : ");
			st[0] = sc.nextInt();
			if(st[2] >= 0 && st[2] <= 100)
				break;
		}
		
		st[3] = st[0] + st[1] + st[2];
		System.out.println("총점 : " + st[3]);
		double avg = st[3] / 3.0;
		System.out.println("평균 : " + avg);
		
	}
	
}
