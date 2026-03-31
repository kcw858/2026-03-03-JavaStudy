package com.sist.lang;
/*
 *  String과 동일 => append => 문자열 결합
 *  
 *  String은 결합때마다 삭제 후 새로운 메모리를 생성해서 속도가 느리다
 *  따라서 결합에서만 StringBuilder / StringBuffer 보통사용
 */
import java.io.*;
public class StringBuffer_1 {

	public static void main(String[] args) {
		
		try 
		{
			String foodData = "";
			FileReader fr = new FileReader("C:\\JavaDev\\food.txt");
			/*
			 * FileReader : 문자 스트림 => 한글이 포함된 파일 읽기
			 * FileInputStream : 바이트 스트림 (한글이 깨짐) => 다운로드/업로드
			 */
			//StringBuffer sb = new StringBuffer();
			StringBuilder sb = new StringBuilder();
			int i = 0; //한글자씩 읽어 온다 => 정수형으로 읽어 온다
			long start = System.currentTimeMillis();
			while((i=fr.read()) != -1)
			{
				//foodData += (char)i;
				sb.append((char)i);
			}
			fr.close();
			long end = System.currentTimeMillis();		
			//데이터 출력
			//System.out.println(foodData);
			System.out.println(sb.toString());
			System.out.println("걸린 시간: " + (end-start) +"MS");
			
		}catch(Exception ex){}
	}

}
