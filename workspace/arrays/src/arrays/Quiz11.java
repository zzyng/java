package arrays;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===== 아파트 입주자 정보 =====");
		System.out.print("건물의 층수를 입력하세요 : ");
		int floor = input.nextInt();

		String[][] pension = new String[floor][];
		for (int i = 0; i < pension.length; i++) {
			System.out.print(i + 1 + "층의 총 호실 입력 : ");
			int room = input.nextInt();
			pension[i] = new String[room];
		}

		System.out.println("===== 아파트 층별 정보 =====");
		for (int i = 0; i < pension.length; i++) {
			System.out.printf("%d층은 %d호실 까지 있습니다.\n", i + 1, pension[i].length);
		}

		System.out.println("각 호실의 입주자 정보를 입력하세요");
		for (int i = 0; i < pension.length; i++) {
			System.out.println(i + 1 + "층 정보를 입력하세요.");
			for (int j = 0; j < pension[i].length; j++) {
				System.out.printf("%d층 %d호실: ", i + 1, j + 1);
				pension[i][j] = input.next();
			}
		}

		System.out.println("======== 입주자 정보 ========");
		for (int i = 0; i < pension.length; i++) {
			for (int j = 0; j < pension[i].length; j++) {
				System.out.println(i + 1 + "층 " + (j + 1) + "호실 입주자: " + pension[i][j]);
			}
		}

	}
}
