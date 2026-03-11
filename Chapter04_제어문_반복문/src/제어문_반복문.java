/*
 * 	자바 반복문
 * 	1. for
 * 	2. while
 * 	3. do-while	=> 반드시 한번이상 수행
 * 
 * 	반복제어
 * 	1. break  => 반복을 중단
 * 	2. continue => 특정 부분을 제외
 * 
 * 	최신 => for-each: 웹에서 주로 사용 
 * 			변경은 불가능 => only 출력 => 배열/컬렉션
 */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력
	
		/*
		 *  형식
		 *  	for(초기값;조건식;증가식)
		 *  	{
		 *  		반복 실행 문장
		 *  	}
		 *  
		 *  실행순서
		 *  	1.초기값
		 *  	2.조건식
		 *  		-true : 3.반복 실행문장을 실행 => 4. 증가식 => 다시 조건식으로 이동
		 *  		-false: 종료
		 *  
		 *  for문의 무한루프 => for(;;)
		 *  
		 */
		
		
			  //        | false면 종료
			  //1)      2)    4)
//		for(int i=1; i <= 10; i+=2)
//		{				| true면 실행
//			System.out.println(i); 3)
//		}
		
		
		
//		for(;;)
//			System.out.println("Hello Java");
		
		//알파벳 출력	
		for(char c = 'A' ; c <= 'Z' ; c++)
			System.out.print(c);
	}

}
