import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// 배열에 데이터값을 나중에 대입
		
		int[] arr = new int[5]; //초기값은 0으로 5개
		// int = 0
		// double = 0.0
		// boolean = false
		// String = null
		// char = '\0'
		// 메모리 생성갯수는 반드시 사용
		
		//프로그램에 필요한 데이터 넣기
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = (int)(Math.random()*100) +1;
		}
		
		
//		for(int a:arr)
//		{
//			System.out.println(a);
//		}
		
		System.out.println(Arrays.toString(arr)); //배열의 저장된 형식으로 출력
		
		//Arrays.sort(arr); //오름차순 정렬
		
		//System.out.println(Arrays.toString(arr));
		
		//배열은 기능별로 묶어야한다.
		
	}

}
