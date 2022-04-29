package arrays;

public class Ex02 {
	
	public static void main(String[] args) {
		int [] arr = new int[7];
		
		for(int i = 0 ; i < arr.length ; i++) // arr.length = 공간값이 바뀌어도 접근할수 있다.
		arr[i] = 10 * (i+1);

		for(int i = 0 ; i < arr.length ; i++)
		System.out.println("arr[" + i + "] : " + arr[i]);

	}

}
