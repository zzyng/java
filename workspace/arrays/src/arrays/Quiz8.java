package arrays;

import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Random r = new Random();
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			// 중복체크
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}

		System.out.print("번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
