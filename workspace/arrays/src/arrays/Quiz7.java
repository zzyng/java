package arrays;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name_lst[] = new String[5];
		int age_lst[] = new int[5];
		
		for (int i=0;i<5;i++) {
			System.out.println((i+1) + "번째 정보 입력 ");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			name_lst[i] = name;
			age_lst[i] = age;
		}
		
		for (int i = 0 ; i < age_lst.length-1 ; i++) {
			for (int j = i + 1 ; j < age_lst.length ; j++) {
				if (age_lst[i] > age_lst[j]) {
					int tmp = age_lst[i];
					age_lst[i] = age_lst[j];
					age_lst[j] = tmp;
					String tt5mp = name_lst[i];
					name_lst[i] = name_lst[j];
					name_lst[j] = tt5mp;
				}
			}
			
		}
		for (int i=0;i<5;i++) {
			System.out.println((i+1) + "정보");
			System.out.println("이름 : " + name_lst[i] + " , 나이 : " + age_lst[i] + "세");
		}
		
	}

}
