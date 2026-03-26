package com.sist.exception;

import java.io.*;
import java.sql.SQLException;
//IOException => Exception => Throwable
public class 예외처리_2 {

	public static void main(String[] args) {
		FileReader in = null;
		try 
		{
			in = new FileReader("C:\\Users\\sist-25\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
			int i = 0;
			while((i = in.read()) != -1)
			{
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace(); //에러 위치를 확인
			//getMessage()
		}
		finally //생략이 가능
		{
			try 
			{
				in.close();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		/*
		 * try-resource : 자동 닫기 (finally 없이)
		 * throws
		 * throw
		 * 사용자 정의
		 * -----------------------------------
		 */
	}

}
