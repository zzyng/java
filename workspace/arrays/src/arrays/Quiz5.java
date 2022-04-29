package arrays;

import java.util.Scanner;

public class Quiz5 {
//	입력 받은 수 만큼 배열을 항당하고, 배열에 값 입력 및 출력하기.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1 =0, data2 = 0;
		
		System.out.print("생성할 배열의 길이를 입력 : ");
		data1 = sc.nextInt();
		System.out.println(data1 + "의 배열이 생성되었습니다.");
		int num[] = new int[data1];
		
		for (int i = 0 ; i < num.length ; i++) {
			System.out.print( i+1 + "번째 데이터 : ");
			num[i] = sc.nextInt();
			data2 = i;
		}
		System.out.print("배열의 데이터 : ");
		for(int i = 0 ; i < num.length ; i++)
		System.out.print(" " + num[i]);
		System.out.println(" 입니다.");

	}

}
