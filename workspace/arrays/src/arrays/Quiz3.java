package arrays;

import java.util.Scanner;

public class Quiz3 {
	
	
	public static void main(String[] args) {
//		5개의 정수를 입력 받아 오름차순 일 경우 “ascending”, 내림차순 일 경우 “descending”, 둘 다 아닐 경우 “mixed”를 구분하여 출력 하시오.
//		입력 : 1 2 3 4 5
//		출력 : ascending
//		입력 : 8 7 6 5 4 
//		출력 : descending
//		입력 : 8 1 7 2 6
//		출력 : mixed

		Scanner sc = new Scanner(System.in);
		int datas[] = new int[5];
		int asc = 0, dec = 0;

		System.out.print("입력 : ");
		for(int i = 0; i < datas.length; i++)
			datas[i] = sc.nextInt();
		
		for(int i = 0; i < datas.length-1; i++) {
			int tmp = datas[i] - datas[i+1];
			
			if(tmp == -1)
				asc++;
			else if(tmp == 1)
				dec++;
		}
		
		if(asc == datas.length-1)
			System.out.println("ascending");
		else if(dec == datas.length-1)
			System.out.println("descending");
		else
			System.out.println("mixed");
		
	}
}













