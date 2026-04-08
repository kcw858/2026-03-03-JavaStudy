package com.sist.stream;
/*
 *  문자 스트림
 *  -------- 2byte씩 파일 읽기 (한글이 안깨진다)
 *  		 자바: 한글 한글자 2bye , 오라클은 3byte
 *  
 *  		Reader 		 Writer
 *  		  |				|
 *  	 FileReader	    FileWriter
 *  	 BufferedReader BufferedwWiter
 *  
 *  => 파일 자체 제어: 글쓰기 / 읽기 
 *  			   ----------
 *  				ObjectInputStream
 */
//파일 읽기
import java.io.*;
public class Reader_1 {

	public static void main(String[] args) {
		FileReader in = null; // 클래스의 기본값: null
		
		try
		{
			in = new FileReader("c:\\java_data\\sawon.txt");
			//int read() => 1글자씩 2byte로 읽는다
			//close() => 닫기
			int i = 0;
			while((i = in.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}
			catch(Exception ex) {}
		}
	}

}
