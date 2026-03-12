/*
 * 1. 배열 선언
 * 2. 배열 초기화
 * 3. 반복문을 이용한 데이터 출력
 * 4. 배열 복사
 * 5. 동적 생성
 * 
 * 
 *  1) 선언
 *  	데이터형[] 배열명; -> 권장
 *  	데이터형 배열명[];
 *  
 *  	정수 : int[] arr
 *  	문자 : char[] arr
 *  	문자열 : String[] arr
 *  	실수 : doublep[] arr
 *  	논리 : boolean[] arr
 *  
 *  2)초기화
 *  	10,20,30,40,50
 *  
 *  	int[] arr = {10,20,30,40,50}; //선언과 동시에 초기화
 *  
 *  	 stack				heap
 *  	--arr--     -------------------
 *  				10  20  30  40  50
 *  	-------		--------------------
 *  				0   1    2   3   4
 *  			arr[0]
 *  				arr[1]
 *  					arr[2]
 *  						arr[3]
 *  							arr[4]
 *  
 *  	arr[0] = 100 => 100으로 변경됨
 *  	
 *  	범위를 초과하면 오류발생 ex) arr[5] ArratIndexOutOfBoundsExeption
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,20};
//		
//		System.out.println(arr[2]);
		
		int[] arr = {10,20,30,40,50};
		System.out.println("arr= " + arr);
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		arr[0] = 100;
//		arr[1] = 200;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//배열의 갯수는 arr.length
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("==============");
		
		//향상된 for문 => 화면출력시 많이 사용
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		// 배열에 실제 저장된 값을 가지고 온다
		// 데이터가 모아진 상태에서 사용
		// 데이터형이 동일 / 큰데이터형으로 받을 수 있다
		// 데이터값 수정은 for-each 불가, 일반 for문 사용
		// 화면 출력은 for-each구문 사용
	}

}
