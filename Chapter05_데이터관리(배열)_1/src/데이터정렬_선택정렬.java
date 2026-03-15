/*
 * 정렬
 * 40 20 50 10 30
 * -  -
 * 20 40
 * -     -
 * 20    50
 * -		-
 * 10       20
 * -		   -
 * 10          30
 * -------------------- round1
 * 10 40 50 20 30
 * 	  -  -
 * 	  40 50
 * 	  -     -
 * 	  20    40
 * 	  -         -
 * 	  20        30
 * -------------------- round2
 * 10 20 50 40 30
 * 		 -   -
 *       40  50
 *       -      -
 *       30     40
 * -------------------- round3
 * 10 20 30 50 40
 *           - -
 *           40 50
 * -------------------- round4
 * 10 20 30 40 50  => for-> length -1
 */
import java.util.Arrays;

public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		//초기화
		for(int i = 0 ; i <arr.length ; i++)
		{
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		System.out.println("정렬 전: ");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n정렬 후:");
		
		//오름차순 = ASC    <->   내림차순 = DESC
		for(int i = 0 ; i < arr.length-1 ; i++) //마지막은 정령되어있는 상태이기때문에
		{
			for(int j = i+1; j < arr.length; j++) //다음 인덱스를 비교해 나간다
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i]; //값 교환시 임시변수 설정
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}

}
