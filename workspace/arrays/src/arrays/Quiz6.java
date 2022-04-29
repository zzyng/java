package arrays;

import java.util.Scanner;

public class Quiz6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1 = 0;
		
		System.out.print("생성할 배열의 길이를 입력 : ");
		data1 = sc.nextInt();
		System.out.println(data1 + "의 배열이 생성되었습니다.");
		int num[] = new int[data1];
		System.out.println("값을 입력하세요.");
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print( i+1 + "번째 데이터 : ");
			num[i] = sc.nextInt();

		}
		for(int i = 0; i < num.length - 1 ; i++) {
			for(int j = i + 1 ; j < num.length ; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		System.out.print("배열의 데이터 : ");
		for(int i = 0 ; i < num.length ; i++)
		System.out.print(" " + num[i]);
		System.out.println(" 입니다.");
		
		System.out.println("정렬 후 : ");
		for(int i = 0 ; i < num.length ; i++)
			System.out.print(num[i] + " ");
	}

}
