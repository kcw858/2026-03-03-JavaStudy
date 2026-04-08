package com.sist.stream;
//FileWriter => write() / close()
//				-----write(String s)
import java.io.*;
import java.util.Scanner;
public class Writer_1 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		FileReader fr = null;
		try
		{
			fw = new FileWriter("c:\\java_data\\member.txt",true);
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 입력: ");
			String name = scan.next();
			System.out.print("성별 입력: ");
			String sex = scan.next();
			System.out.print("전화번호 입력: ");
			String phone = scan.next();
			
			//구분이 없다 => 한명(\n), 어떤 데이터인지 구분(| ,)
			//오라클:			row			컬럼
			
			String data = name + "," + sex + "," + phone + "\n";
			fw.write(data);
			System.out.println("회원 가입 완료!!");
			
			fr = new FileReader("c:\\java_data\\member.txt");
			int i = 0;
			while((i = fr.read()) != -1)
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
				fw.close();
				
			}catch(Exception ex) {}
		}
	}

}
