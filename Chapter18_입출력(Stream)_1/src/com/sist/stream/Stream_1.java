package com.sist.stream;
/*
 *  IO: Input / Output
 *  	 입력		  출력
 *  	---------------System.in / System.out
 *  					키보드 입력    명령프롬프트에 출력
 *  				   --------------------------> 표준입출력
 *  
 *   => 프로그램 외부소스를 목적지의 데이터 정보교환
 *   		  -----	  ----
 *   		   |		|
 *   				   프로그램에서 화면,파일에 나가는 데이터
 *   		  입력: 키보드, 파일, 네트워크
 *   
 *   출발지		----------------		-------------- 도착지
 *    1. 키보드	입력 스트림	 ----->			 출력 스트림 --->	 1. 모니터
 *    2. 파일		---------------- 프로그램  --------------	 2. 파일
 *    3. 프로그램										     3. 브라우저
 *    			 데이터를 읽어오는 객체		 데이터를 써서 보내는 객채
 *    
 *    스트림: 응용프로그램(개발자)과 I/O객체를 연결해서 데이터를 이동하는 통로
 *    		=> 단방향으로만 연결
 *    
 *    스트림 클래스
 *    ---------
 *    	입력 스트림
 *    		1byte 전송: 바이트 스트림 
 *    		 InputStream: interface
 *    			 | => 구현된 클래스
 *    		 ***FileInputStream (파일과 관련)
 *    		 ***BufferedInputStream
 *    		 ObjectInputStream
 *    
 *    		2byte 전송: 문자 스트림 
 *    		 Reader: interface
 *    			|
 *    		 ***FileReader (파일과 관련)
 *    		 ***BufferedReader (메모리 -> 키보드 입력)
 *    			-> 한줄씩 파일 읽기 / 외부소스 읽기
 *    
 *    	출력 스트림
 *    		1byte : 바이트 스트림
 *    		 OutputStream: interface
 *    		     |
 *    		 ***FileOutputStream (파일과 관련)
 *    		 ***BufferedOutputStream (메모리)
 *    
 *    		2byte 전송: 문자 스트림 
 *    		 Writer: interface
 *    			|
 *    		 ***FileWriter (파일 쓰기)
 *    		 ***BufferedWriter (메모리에 저장)
 *    		 ***PrintWriter
 *    
 *    1.FileInputStream: 파일 읽기
 *    	--------------- 다운로드, 파일 이동
 *    	--------------- 이미지, 동영상...
 *    	--------------- 변환 InputStreamReader
 *    					  	-----------------
 *    						| 바이트 스트림을 문자 스크림으로 변환
 *      = read(): 읽기 => 1글자씩 읽기 => byte단위로 읽는다
 *      = close(): 닫기
 *      
 *      => CheckException으로 반드시 예외처리를 해야한다
 */
import java.io.*;
public class Stream_1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try
		{
//			File file = new File("");
//			fis = new FileInputStream(file);
			fis = new FileInputStream("C:\\Users\\sist-25\\git\\java-study\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			//파일 읽기
//			int i = 0; //한글자씩 정수로 읽는다
//			while((i = fis.read()) != -1) //-1은 파일의 끝 (EOF)
//			{
//				System.out.print((char)i); 
//				//1byte라서 2byte인 한글은 깨진다
//				//한글 파일을 읽는 용도가 아니다
//				//파일 이동시 사용
//			}
			
			while(true)
			{
				String s = br.readLine();
				if(s == null)
					break;
				System.out.println(s);
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
			//getMessage() : 파일을 찾을 수 없다
			//printStackTrace(): 실행하는 과정 => 해당위치 종류
		}
		finally 
		{
			try
			{
				fis.close();
			}catch(Exception ex) {}
		}
	}

}
