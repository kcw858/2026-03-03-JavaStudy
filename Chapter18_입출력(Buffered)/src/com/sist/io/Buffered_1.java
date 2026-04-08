package com.sist.io;
// Scanner (X) => BufferedReader
// int/double     무조건 String만 => 예외처리

import java.io.*;
/*
 *  BufferesInputStream / BufferesOutputStream  => 다운로드
 *  		|						|
 *  FileInputStream			FileOutputStream
 *  
 */
public class Buffered_1 {

	public static void main(String[] args) {
		
		try
		{
			//파일 읽기: 파일을 임시 저장
			FileInputStream fis = new FileInputStream("C:\\JavaDev\\고객.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			//파일 쓰기
			FileOutputStream fos = new FileOutputStream("C:\\java_data\\고객.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i = 0; // 읽은 바이트 수
			//read() => 문자의 번호 -> char로 변환 필요
			byte[] buffer = new byte[1024];
			while((i = bis.read(buffer,0,1024)) != -1)
			{
				bos.write(buffer,0,i);
			}
			
			fis.close();
			bis.close();
			fos.close();
			bos.close();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
