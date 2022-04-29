package arrays;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
//		2022년 1월 1일은 토요일입니다. 두 수 a ,b를 입력 받아 2022 년 a월 b일이 무슨 요일인지 출력하세요. 
//		요일의 이름은 일요일부터 토요일입니다. 
//	    예를 들어 a=2, b=22라면 2월 22일은 화요일이므로 문자열 ＂화요일"을 
//	    출력하세요. 단, 13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다. 
		Scanner sc = new Scanner(System.in);

		String[] weeks = { "금요일", "토요일", "일요일", "월요일", "화요일", "수요일", "목요일" };
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int mm, dd, total = 0;
		while (true) {
			System.out.print("월 일 입력 : ");
			mm = sc.nextInt();
			dd = sc.nextInt();
			if (mm > 0 && mm < 13 && dd > 0 && dd <= months[mm - 1])
				break;
		}

		for (int i = 0; i < mm - 1; i++)
			total += months[i];
		
		total += dd;
		int index = total % 7;
		System.out.printf("2022년 %02d월 %02d일은 %s입니다.\n", mm, dd, weeks[index]);
	}
}
