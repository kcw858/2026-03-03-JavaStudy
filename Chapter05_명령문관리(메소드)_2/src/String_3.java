/*
 *  목표
 *  
 *   1. 메소드 이해
 *   2. String클래스 이해
 *   3. 객체지향 개념이해
 *   -----------------
 *   4. 상속 / 포함
 *   5. 다형성
 *   6. 클래스 설계
 *   7. 인터페이스
 *   -----------------
 *   8. 예외처리
 *   9. java.util / java.lang => String
 *   10. java.io / java.net
 *   11. java.sql
 *   ----------------
 *   
 *   import java.lang.* => 자주 사용하기떄문에 생략가능
 *    => String, Math
 *    
 *    String => 주요 메소드
 *    	원하는 위치(인덱스 번호 찾기)
 *    
 *    	indexOf / lastIndexOf
 *    	-------   -----------
 *    	앞에서 찾기	    뒤에서 찾기
 *    	->문자 찾기    ->경로,파일 찾기
 *    
 *    원형 int indexOf(char c)
 *    	  int indexOf(String s)
 *    	=> -1일 경우: 없는 경우
 *    
 *    	  int lastIndexOf(char c)
 *    	  int lastIndexOf(String s)
 *     => -1일 경우: 없는 경우
 *    
 *    
*/
//164page
import java.io.*;
public class String_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		File dir = new File("C:\\JavaDev");
//		File[] files = dir.listFiles();
//		
//		for(File f:files)
//		{
//			if(f.isFile()) //파일인 경우에만 출력
//			{
//				String name = f.getName();
//				String ext = name.substring(name.lastIndexOf(".")+1); //마지막 .뒤에 있는 확장자만 출력, 1을 더해서 .은 포함X
//				System.out.println(ext);
//			}
//		}
		
		String msg = "Hello Java!!";
		
		System.out.println("a의 위치: "+ msg.indexOf("a")); //일반적으로 많이 사용
		System.out.println("a의 위치: "+ msg.lastIndexOf("a")); //경로나 확장자를 찾을때 주로 사용
		System.out.println("b의 위치: "+ msg.indexOf("b"));      //없어서 -1
		System.out.println("b의 위치: "+ msg.lastIndexOf("b")); //없어서 -1
		String ext = msg.substring(msg.lastIndexOf("b")+1);  //없는 문자열을 찾으면 전체를 반환
		System.out.println(ext);
		//문자열을 사용해서 제어 => 원본은 불변

	}

}
