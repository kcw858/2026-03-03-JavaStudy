package com.sist.stream;
// Input / Output => 파일이동 / 다운로드 / 업로드
// 한글 => 파일제어 (읽기,쓰기) => Read / Write

import java.io.*;
public class Stream_3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try
		{
			fis = new FileInputStream("c:\\javaDev\\lombok-1.18.40.jar");
			fos = new FileOutputStream("c:\\java_data\\lombok.jar");
			int i = 0; // 읽은 바이트 수
			byte[] buffer = new byte[1024]; // 파일 복사용 => 다운로드                                                                                                                                                
			// read() 한글자// 큰 파일은 속도가 느리다
			// read(byte[]) 
			while((i = fis.read(buffer,0,1024)) != -1) 
			{
				fos.write(buffer,0,i);
			}
			
			System.out.println("파일 복사 완료");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			try
			{
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			}
			catch(Exception ex)
			{
				
			}
		}
	}

}
