/*
 *  메소드 사용 목적 
 *  1) 코드 재사용
 *  2) 가독성 향상 => 메소드안에는 한가지 기능만 수행
 *  3) 유지보수가 쉽다
 *  4) 프로그램 구조화
 *  5) 반복제거
 *  
 *  	1. 메소드를 만드는 경우
 *  	 - 원형: 이턴형 메소드명(매개변수...)
 *  	 - 구현	
 *  		{
 *  			구현 => 연산처리 / 제어문 처리
 *  		}
 *  	 - 가급적이면 main이 아닌 메소드를 만들어서 처리
 *  	
 *  	2. 리턴형은 한개만 사용이 가능
 *  	 - 여러개인 경우는 배열이나 클래스 이용
 *  
 *  	3. 매개변수는 여러개 사용이 가능
 *  	 - 배열이나 클래스 이용이 편리
 *  	
 *  // 문자 1개를 입력받아 대문자면 소문자로 소문자면 대문자로 만드는 프로그램
	// ------ 매개변수 char      return형 char
	
	// 5개의 정수를 입력해 가장 큰값을 출력
	// ------- 매개변수 int[]     return형 int
	
	// 5개의 정수를 입력해 정렬한 데이터를 출력
	// ------- 매개변수 int[]     return형 int[], void(자체 출력)
 *  
 *  
 *  //5개 정수를 받아서 평균 / 총점을 출력
 *  // 자체출력이 편하다
 */
import java.util.Arrays;
public class 메소드_6 {
	
	// 문자 1개를 입력받아 대문자면 소문자로 소문자면 대문자로 만드는 프로그램
	//'A' 65   'a' 97
	static char change(char c)
	{
		//toUpperCase()  toLowerCase()
		return c >= 'A' && c <='Z' ? (char)(c+32) : (char)(c-32);
	}
	
	// 5개의 정수를 입력해 가장 큰값을 출력
	static int max(int[] arr)
	{
		int max = arr[0];
		
		for(int i = 0; i < arr.length ; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
			return max;
	}
	
	static int min(int[] arr)
	{
		int min = arr[0];
		
		for(int i = 0; i < arr.length ; i++)
		{
			if(min > arr[i])
				min = arr[i];
		}
			return min;
	}
	
	// 5개의 정수를 입력해 정렬한 데이터를 출력
	static void sort(int[] arr,String type)
	{
		for(int i = 0; i < arr.length-1 ; i++)
		{
			for(int j = i+1; j < arr.length; j++ )
			{
				boolean b = false;
				
				if(type.equals("ASC"))
				{
					b = arr[i]>arr[j];
				}
				else
				{
					b = arr[i]<arr[j];
				}
				if(b)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}
	
	static void desc(int[] arr)
	{
		for(int i = 0; i < arr.length-1 ; i++)
		{
			for(int j = i+1; j < arr.length; j++ )
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("내림차순 정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}

	//5개 정수를 받아서 평균 / 총점을 출력
	static void gesan(int[] arr)
	{
		int sum = 0;
		double avg = 0.0;
		
		//인덱스 이용
//		for(int i = 0; i < arr.length ; i++)
//		{
//			sum += arr[i];
//		}
		
		//실제 데이터 이용
		for(int i : arr)
		{
			sum += i;
		}
		
		avg = sum / (double)arr.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}
	public static void main(String[] args) {
			
//		char c = 'B';
//		char res = change(c);	
//		System.out.println(res);



		int[] arr = new int[5];	
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		int m = max(arr);	
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값은 " + m + "입니다");
		m = min(arr);
		System.out.println("최소값은 " + m + "입니다");
		
		
//		sort(arr);//void는 받는값이 없어 메소드 호출만
//		desc(arr);//내림차순
		sort(arr,"DESC");
		gesan(arr);
	}

}
