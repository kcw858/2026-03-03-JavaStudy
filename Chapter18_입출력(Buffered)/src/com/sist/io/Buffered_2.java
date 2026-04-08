package com.sist.io;
/*
 *  BufferedReader: 외부에서 데이터 읽기, 네트워크 통신, 키보드 입력 가능
 */
import java.io.*;
public class Buffered_2 {

	public static void main(String[] args) {

		try
		{
			//1byte를 2byte로
			//키보드로 입력 받기
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("문자열 입력: ");
			String msg = in.readLine();
			System.out.println(msg);
		}catch(Exception ex)
		{
			
		}
	}

}
