package com.sist.io;
/*
 * 라이브러리
 * 	java.lang
 * 		Object: toString(), clone(), equals(), hashCode()
 * 		String: equals(), length(), trim(), substring(), 
 * 				split(), valueOf(), replace(), replaceAll()
 * 				indexOf(), lastIndexOf()
 * 		Math: ceil(), random()
 * 		Wrapper
 * 			=> int ==> Integer: parsrInt()
 * 			=> double ==> Double: parseDouble()
 * 			=> boolean ==> Boolean: parseBoolean()
 * 		StringBuffer  /  StringBuilder
 * 			비동기			  동기       ==>문자열 결합: append()
 * 
 * 	java.util
 * 		StringTokenizer
 * 			= counterTokens()
 * 			= hasMoreTokens()
 * 			= nextToken()
 * 		Date => 기능이 없다 => 데이터베이스 호환용
 * 				--------> Calendar
 * 							-> 설정: set(), 값 읽기: get()
 * 		List: add() / remove() / set() / isEmpty() / size() / clear()
 * 		Set: add() / remove() / isEmpty() / size() / clear()
 * 		Map: put() / remove() / get()
 * 
 * 		기타
 * 			Random: nextInt()
 * 			DecimalFormat / simpleDateFormat
 * 				  |					|
 * 				  ------------------- format()
 * 
 * 		람다 
 * 			stream() / map() / filter() / forEach() / collect()
 * 	
 * 
 * 	자바 IO
 * 	
 * 	1. IO(Input / Output)
 * 		입력: Input => 프로그램이 외부 데이터를 받는 것
 * 			 키보드 / 파일 / 네트워크 / 데이터베이스
 * 		출력: Output => 프로그램이 외부에 데이터를 보내는 것
 * 			 화면출력 / 파일쓰기 / 네트워크 전송 / DB에 값 보내기
 * 							  ----------------------
 *  2. IO 특징
 *  	= Stream기반: 데이터를 운반하는 통로
 *  	  (단방향) 	 ---------------
 *  					|
 *  				 1byte(알파벳,숫자) / 2byte(각국의 언어)
 *  				 --------------	   --------------
 *  					바이트 스트림		문자 스트림
 *  			- 이미지, 동영상, 파일 처리  - 문자 읽기 / 쓰기
 *  
 *  바이트 스트림
 *  	InputStream    /    OutputStream
 *  	---------------------------------
 *  	| FileinputStream   FileOutputStream
 *  문자 스트림
 *  	Reader		/		Writer
 *  	--------------------------
 *  	| FileReader	   FileWriter
 *  보조 스트림
 *  	BufferedInputStream 	/ 	BufferedOutputStream
 *  	-------------------------------------------------
 *  	| BufferedReader				BufferedWriter
 *  객체 스트림
 *  	ObjectInputStream	/	ObjectOutputStream
 *  	
 *  => 파일 쓰기 / 파일 읽기 / 다운로드 / 업로드
 *  
 *  	자동화: json, xml, yml, yaml
 *  		  ---------	 ---------
 *  			웹		   CI CD
 * 			  Git: IP/Key 노출
 *  	
 *  | read() / write() / close()
 *  
 *  File: 파일에 대한 정보
 *  	  --- file, directory
 *   => new File("c:\\javaDev") -> dir
 *   	new File("c:\\javaDev\\a.jpg") -> 파일
 *    1.목적 
 *    	- 메모리 저장 => 프로그램 종요시에 자동으로 데이터가 사라진다
 *    		| RAM -> 휘발성
 *    		| 영구적인 저장장치 : file, RDBMS(오라클), XML, JSON
 *    		| 전송하는 데이터: JSON
 *    		| 설정하는 파일: XML
 *    	   파일
 *    		- 데이터 노출 / 파일이 깨짐 / 잊어버릴 가능성 / 구분자가 없다  
 *    		  오라클: 오라클은 변수별로 구분이 되어있다, 이미지 파일로 되어있어 보안이 뛰어나다, 사용이 편리하다
 *    		- 파일은 임시저장시 많이 사용
 *    	파일 정보 확인
 *    	----------
 *    	File
 *    	 = 생성자
 *    		new File("경로명/폴더명")
 *    		new File("경로명/폴더명/파일명")
 *    	 = 파일명: getName(), getPath()
 *    			 --------	---------
 *    			-> 파일명		-> 경로+파일명
 *    	 = 경로명: getParent()
 *    	 = 파일 크기: length()    => long형
 *    	 = 수정일: lastModified  => long형
 *    	 = 숨김 파일: isHidden()  => boolean형
 *    	 = 읽기 전용: canRead()   => boolean형
 *    	 = 쓰기 전용: canWrite()  => boolean형
 *    	 = 파일 / 디렉토리: isFile / isDirectory => boolean형
 *    	 = 파일 제어
 *    		폴더에 있는 모든 파일: File[] listFiles()
 *    		폴더 생성: mkdir()
 *    				mkdirs() -> 폴더안에 폴더생성
 *    		파일 생성: createNewFile()
 *    		파일 삭제: delete()
 *    		파일 존재 여부: exists()
 */	
import java.io.*;
import java.text.SimpleDateFormat;
//CheckedException => 예외처리 필수
public class IO_1 {

	public static void main(String[] args) {
		
		//File
		try
		{
			File file = new File("C:\\JavaDev\\javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			System.out.println("***파일명: " + file.getName());
			System.out.println("***경로+파일명: " + file.getPath());
			System.out.println("경로명: " + file.getParent());
			//SimpleDateFormat
			SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println("수정일: " + sdf.format(file.lastModified()));
			System.out.println("숨김 파일: " + file.isHidden());
			System.out.println("***파일 여부: " + file.isFile());
			//isXxxx는 => boolean
			//setXxx는 => void
			//getXxx는 => return형
			System.out.println("읽기 전용: " + file.canRead());
			System.out.println("쓰기 전용: " + file.canWrite());
			
		}catch(Exception ex) {}
	}

}
