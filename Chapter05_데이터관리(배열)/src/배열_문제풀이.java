/*
 *  배열 : 같은 유영 데이터를 여러개 모아서 관리할 목적
 *  	=> 가변형 / 필요데이터 저장이 가능 =? 컬렉션
 *  		ArrayList / LinkedList / Vector / Map /Set
 *  
 *  
 *  1) 특징
 *  	-연속적인 메모리 할당 -> 인덱스를 통해서 접근
 *  	-고정된 크기
 *  		배열 크기는 선언시에 정해진다
 *  		한번 선언하면 변경이 불가능하다
 *  		선언) 
 *  			데이터형[] 배열명 = {값...} 선언과 동시에 초기화
 *  			데이터형[] 배열명 = new 데이터형[갯수] 
 *  	-가급적 동일한 데이터 타입 넣을것
 *  
 *  2) 장점
 *  	-빠른 접근속도 => 인덱스 번호 이용하기떄문에
 *  	-간단한 구현 : 단순한 구조
 *  	-고정된 크기(장단점이다): 메모리의 사용량을 예측, 메모리 관리가 쉽다
 *  
 *  3) 단점
 *  	-고정된 크기를 사용하기 때문에 추가,삭제가 어렵다(비용이 많이든다)
 *  	-메모리 낭비가 심할 수 있다 / 크게 만들면 사용하지않는 메모리가 있을 수 있다 / 적게만들면 데이터 추가 저장 불가
 *  	-같은 데이터형만 사용해 유연성이 떨어진다
 *  
 *  4) 배열선언
 *  	데이터형[] 배열명
 *  
 *  5) 초기화
 *  	선언과 동시에 초기화 : 데이터형[] 배열명 = {값....}  (명시적 초기화)
 *  	default값을 생성	: 데이터형[] 배열명 = new 데이터형[갯수]
 *  
 *  6) 반복문을 이용 출력 방법
 *  	=> for-each문 (향상된 for 문)
 *  	
 *  		for(변수 선언:배열명)
 *  		
 *  		-배열에 실제 저장된 값을 받는다
 *  		-인덱스를 이용하지않고 실제 저장된 값 이용
 *  		-자동으로 종료
 *  		-배열범위 초과시 오류발생하는데 for-each문은 오류가 잘 발생하지않는다.
 *  		-브라우저 화면 UI에 많이 사용
 *  
 *  7) 저장 위치가 다르다
 *  	int[] arr = {10,20,30}
 *  	
 *  	---arr---	-------------
 *  	 시작주소	     10  20  30
 *  	---------   -------------
 *  
 *  	실제 저장된 메모리의 주소를 이용하는 데이터형이다(참조형 데이터)
 */

import java.util.Arrays;
import java.util.Scanner;

public class 배열_문제풀이 {

	public static void main(String[] args) {
		System.out.println("1)다음 중 배열 선언이 잘못된 것은?");
		System.out.println("답: "+ 4);

		System.out.println();
		
		
		
		
		
		System.out.println("2)배열을 선언하고 생성하는 다음 물음에 답하라");
		System.out.println();
		System.out.println("1. 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.");
		System.out.println("char[] c = new char[10]");
		System.out.println();
		System.out.println("2. 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.");
		System.out.println("int[] arr = {0,1,2,3,4,5}");
		System.out.println();
		System.out.println("3. '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.");
		System.out.println("char[] day = {'일','월','화','수','목','금','토'}");
		System.out.println();
		System.out.println("4. 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.");
		System.out.println("boolean[] bool = {true, false, false, true}");
		
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("3)배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.");
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i = 0 ; i < alpha.length ;i++)
		     System.out.print(alpha[i]);


		System.out.println("\n");
		
		

		
		
		
		System.out.println("4)양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라");
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];

		for(int i = 0 ; i < arr.length ;i++)
		{
			int num = (int)(Math.random()*100) + 1;
			
			if(num <= 0)
			{
				System.out.println("양의 정수만 입력해주세요.");
				i--;
				continue;
			}		
			arr[i] = num;
		}
		System.out.println("현재 배열: " + Arrays.toString(arr));
		System.out.print("배열에 있는 정수중  3의 배수: ");
		for(int i : arr)
		{
			if(i % 3 == 0)
				System.out.print(i + " ");
		}

		System.out.println("\n");
		
		
		
		
		
		
		System.out.println("5)정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라");
		
		arr = new int[10];
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = (int)(Math.random()*10) + 1;
			sum += arr[i];
		}
		
		System.out.println("배열에 든 숫자 : " + Arrays.toString(arr));
		System.out.printf("평균값 : %.2f",(sum/10.0));
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		System.out.println("6)5개 정수를 입력받은 후 차례로 출력하는 프로그램");
		System.out.println("입력예) 5 10 9 3 2");
		System.out.println("출력예) 5 10 9 3 2");
		
		arr = new int[5];
		for(int i = 0 ; i < arr.length ; i++)
		{
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
		}
		
		System.out.println("배열에 든 숫자 : " + Arrays.toString(arr));
		
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		System.out.println("7)문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램");
		System.out.println("입력예) A B C D E F G H I J");
		System.out.println("출력예) ABCDEFGHIJ");
		
		char[] c = new char[10];
		
		for(int i = 0 ; i < c.length ; i++)
		{
		
			c[i] = (char)(i+65);
		}
		
		System.out.println("\n배열에 든 숫자 : " + Arrays.toString(c));
		
		for(char i:c)
		{
			System.out.print(i);
		}
		
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("8)정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램");
		System.out.println("입력예) 5 3 9 6 8 4 2 8 10 1");
		System.out.println("출력예) 9 8 1");
		
		arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++)
		{
			int num = (int)(Math.random()*10) + 1;
			
			arr[i] = (int)(Math.random()*10) + 1;
			
			if(i == 2 || i == 4 || i == arr.length-1)
				System.out.print(num + " ");
		}
		
		System.out.println("\n배열에 든 숫자 : " + Arrays.toString(arr));
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		System.out.println(arr[arr.length-1]);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("9)10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램");
		System.out.println("입력예) 5 10 8 55 6 31 12 24 61 2");
		System.out.println("출력예) 61");
		
		arr = new int[10];
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++)
		{
			
			arr[i] = (int)(Math.random()*45) + 46;
			
			if(max < arr[i])
				max = arr[i];
		}
		
		
		
		System.out.println("배열에 든 숫자 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		
		
		sum = 0;
		
		for(int i :arr)
		{
			sum += i;
		}
		System.out.println("sum= " + sum);
		System.out.printf("평균값 : %.2f",(sum/10.0));
	}

}
