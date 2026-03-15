import java.util.Arrays;

public class 빈도수구하기 {

	public static void main(String[] args) {
//		// 0~9난수 발생 ==> 100개 발생
//		int[] arr = new int[10];
//		
//		//초기화
//		for(int i = 1 ; i <= 100 ; i++)
//		{
//			int rand = (int)(Math.random()*10); //0~9
//			
//			arr[rand]++;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i = 0; i<arr.length ; i++)
//		{
//			System.out.println(i + " ==> "+arr[i]);
//		}
		
		
		int[] arr = new int[45];
		
		//초기화
		for(int i = 0 ; i < 1000 ; i++)
		{
			int rand = (int)(Math.random()*45); //1 ~ 45
			
			arr[rand]++;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.println(i+1 + " ==> "+arr[i]);
		}
	}

	
}
