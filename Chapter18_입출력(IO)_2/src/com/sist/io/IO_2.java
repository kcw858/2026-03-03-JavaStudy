package com.sist.io;
/*
 * 	  ----------------------------- (X)
 * 	  |						       |
 *  브라우저 ========= 자바 ========= 오라클
 *  -----			---			  ----
 *  HTML/XML		양쪽 연결		   SQL
 *  (자바는 일반 텍스트)
 *    |
 *  처리: 자바스크립트 React.js ..
 *  
 *  -----------------------------------
 * 1. CRUD
 * 	회원가입 / 로그인 / 회원수정 / 회원탈퇴
 *  게시판
 *  검색 / 상세보기 / 사원, 관리자
 * 2. 네트워크
 *  채팅
 *  
 */
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		
		try
		{
			//1. 파일 목록
			File dir = new File("c:\\JavaDev");
			File[] list = dir.listFiles();
			for(File f : list)
			{
				if(f.isFile()) //파일이면
				{
					String len = f.length() / 1024 > 0 ? (f.length() / 1024)+"KB" : (f.length() / 1024)+ "Byte";
					System.out.println(f.getName() + " " + len);
				}
				if(f.isDirectory()) // 디렉토리면
				{
					System.out.println(f.getName()+ " DIR");
				}
			}
		}catch(Exception ex) {}
	}

}
