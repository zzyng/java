package arrays;

public class Quiz1 {
	
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for (int i=0;i<arr.length;i++) {
		if (arr[i]%2 ==0)
			System.out.print("짝수 : ");
		else
			System.out.print("홀수 : ");
		System.out.println(arr[i]);
			
		}
	}

}
