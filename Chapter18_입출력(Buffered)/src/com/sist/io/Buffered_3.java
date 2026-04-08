package com.sist.io;

import java.io.*;
/*
 *  1byte
 * FileInputStream fis = new FileInputStream("파일명");
 * 	=> 파일에 있는 데이터 읽기
 *  => 파일이 없으면 catch절 수행
 *  
 * FileOutputStream fos = new FileOutputStream("파일명");
 *  => 파일에 데이터를 쓰기
 *  => 파일이 없는경우 만들어준다
 *  
 *  
 *  2byte
 *  FileReader fis = new FileReader("파일명");
 * 	=> 파일에 있는 데이터 읽기
 *  => 파일이 없으면 catch절 수행
 * 
 * FileWriter fos = new FileWriter("파일명");
 *  => 파일에 데이터를 쓰기
 *  => 파일이 없는경우 만들어준다
 */
public class Buffered_3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("c:\\javaDev\\movie.txt");
//			int i = 0;
//			StringBuilder sb = new StringBuilder();
//			
//			while((i = fis.read()) != -1)
//			{
//				sb.append((char)i);
//			}
//			
//			System.out.println(sb.toString());
			
			long start = System.currentTimeMillis();
			//수행속도 최적화
			BufferedReader in = new BufferedReader(new InputStreamReader(fis)); //1줄씩 읽어온다
			StringBuilder sb = new StringBuilder();
			while(true)
			{
				String msg = in.readLine();
				if(msg == null) break; //null값이 마지막
				sb.append(msg+"\n");
			}
			long end = System.currentTimeMillis();
			System.out.println(sb.toString());
			System.out.println("수행시간: " + (end-start) +"MS");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
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
