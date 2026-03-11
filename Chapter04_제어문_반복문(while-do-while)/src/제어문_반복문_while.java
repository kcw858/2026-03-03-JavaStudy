/*
 * 	반복문 
 * 		for : 화면 UI, 알고리즘
 * 			  반복횟수 지정
 * 
 * 		while : Back-End
 * 				파일 / 데이터베이스 / 네트워크
 * 				
 * 		do-while : 시작화면 출력
 * 				   반복횟수가 지정되지 않았을 때
 * 				   1번 이상 반드시 풀력해야 할 때
 * 				   시작과 동시에 문장 실행 후 조건검색
 * 
 * 		제어 
 * 			break : 반복을 종료
 * 			continue : 건너뛰기 (특정 부분을 제외)
 * 
 * 		형식
 * 			1.시작값			int i = 1
 * 			2.종료점			i <= 10
 * 			3.몇번 수행		i++
 * 
 * 			시작값		----1 => 한번만 수행
 * 			while(끝값)	----2 => 반드시 true/false가 나오는 연산자 사용
 * 			{
 * 				실행문장	----3
 * 				증가값	----4
 * 			}
 * 
 * 			시작값		----1
 * 			do
 * 			{
 * 				실행문장	----2
 * 				증가값 	----3
 * 			}while(끝값); ---4		
 * 
 */	
//import java.io.*;
public class 제어문_반복문_while {

	public static void main(String[] args) {
		
//		File file = new File("c:\\javaDev\\movie.txt");
//		
//		FileReader fr = new FileReader(file);
//		
//		//String movie = "";
//		StringBuffer db = new StringBuffer();
//		
//		int i = 0;
//		
//		while((i = fr.read()) != -1)
//		{
//			//movie +=(char)i; 
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		
		System.out.println("======for문======");
		
		for(char c='A'; c <= 'Z'; c++)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("\n======while문======");
		
		char c = 'A';
		while(c <= 'Z')
		{
			System.out.print(c + " ");
			c++;
		}
		
		System.out.println("\n======do-while문======");
		
		c = 'A';
		
		do {
			System.out.print(c + " ");
			c++;
		}while(c <= 'Z');
	}

}
