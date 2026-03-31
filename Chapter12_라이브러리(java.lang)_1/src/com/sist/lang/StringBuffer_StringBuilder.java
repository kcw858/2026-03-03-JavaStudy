package com.sist.lang;

import java.util.StringTokenizer;

/* 521p
 * 
 *  문자열 클래스
 *  ---------
 *  StringBulder / **StringBuffer / **StringTokenizer
 *  	|				 |			-----------------
 *  	-----------------			Tokenizer: 간단한 문자 분리, reutn형이 String, 네트워크/크롤링
 *  	  문자를 모아서 관리				split: 데이터가 많거나 복잡한 문자가 있는경우, reutn형이 String[]
 *  build는 동기화		Buffer는 비동기화
 *  -----------		--------------
 *     안정성			  	  속도
 */
public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		String info = "32,000원 | 2026년 3월 19일 발행 | 448쪽";
		long start = System.currentTimeMillis();
		
		String[] data = info.split("\\|");
		
		for(String s : data)
		{
			System.out.println(s);
		}
		long end = System.currentTimeMillis();
		System.out.println("데이터 갯수: " + data.length);
		System.out.println("걸린 시간: " + (end-start));
		
		
		
		
		System.out.println("==== StringTokenizer ====");
		start = System.currentTimeMillis();
		StringTokenizer st = new StringTokenizer(info,"|");
		System.out.println("데이터 갯수: " + st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end-start));
	}

}
