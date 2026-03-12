// 10개의 정수를 임의로 추출 후 배열에 저장  최대값/최소값
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random r = new Random();
		
		//임의로 추출 (1~100)
		for(int i = 0 ; i < arr.length; i++)
		{
			arr[i] = r.nextInt(100)+1;
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n======== 결과값 =========");
		int max = arr[0];
		int min = arr[0];
		
		for(int i:arr)
		{
			if(max < i)
				max = i;
			
			if(min > i)
				min = i;
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(max == arr[i])
				System.out.println("최대값 위치: " + (i+1));
			if(min == arr[i])
				System.out.println("최소값 위치: " + (i+1));
		}
		
		
	}

}
