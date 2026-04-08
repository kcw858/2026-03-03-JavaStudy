package com.sist.stream;
//FileOutputStream: 파일 쓰기
/*
 *  close(): 닫기
 *  write(): 쓰기
 */
import java.io.*;
public class Stream_2 {

	public static void main(String[] args) {
		
		FileInputStream fis= null;
		FileOutputStream fos = null;
		
		try
		{
			//저장 폴더 만들기
			File dir = new File("c:\\java_data");
			if(!dir.exists()) // 폴더 존재 여부
			{
				dir.mkdir();
			}
			
			File file = new File("c:\\java_data\\sawon.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			fis = new FileInputStream(file); // 읽기
			//자바 응용프로그램 <======> sawon.txt
			fos = new FileOutputStream(file,true); //쓰기
			
//			fos.write('H');
//			fos.write('e');
//			fos.write('l');
//			fos.write('l');
//			fos.write('o');
			
//			String info = "홍길동|남자|개발부|서울|대리|4000\n";
//			fos.write(info.getBytes()); // string => byte[]
//			//getBytes()
//			//client ------- 자바 -------- server
//			//        --->byte
//			//https://www.google.com/search?q=%EC%9E%90%EB%B0%94
//			System.out.println("파일 저장 완료");
			
			int i = 0;
			while((i = fis.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			try
			{
				fis.close();
				fos.close();
			}
			catch(Exception ex)
			{
				
			}
		}
	}

}
