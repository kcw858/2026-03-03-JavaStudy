package com.sist.lang;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {
		//예약일 , 예약시간 만드는 코드
		int[] reserve = new int[(int)(Math.random()*10)+6]; //6~15
		for(int i = 0 ; i < reserve.length ; i++)
		{
			reserve[i] = (int)(Math.random()*31) +1;
			for(int j = 0 ; j < i ; j++)
			{
				//중복 제거
				if(reserve[i] == reserve[j]) //i는 현재발생 j는 저장된 값
				{
					i--;
					break;
				}
			}
		}
		
		// 정렬
		Arrays.sort(reserve);
		
		// DB에 전송
		// 문자열로 묶어서
		String s = "";
		for(int i : reserve)
		{
			s += i+",";
		}
		s = s.substring(0,s.lastIndexOf(",")); // 마지막 "," 제거
		
		System.out.println(s);
		
		System.out.println("예약이 가능한 날");
		StringTokenizer st = new StringTokenizer(s,",");
		System.out.println("예약이 가능한 일수: " + st.countTokens()); //갯수
		while(st.hasMoreTokens()) // 데이터가 없어서 false가 나올때 까지
		{
			System.err.println(st.nextToken());//실제 데이터 읽기
		}
		/*
		 * 		------------------
		 * 			Begin
		 * 		------------------
		 * 			10	st.nextToken
		 * 		------------------
		 * 			20  st.nextToken
		 * 		-----------------
		 * 			30  st.nextToken
		 * 		------------------
		 * 			End => false
		 * 		------------------
		 */
		
		String color = "red,blue,yellow";
		st = new StringTokenizer(color,",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		//System.out.println(st.nextToken()); 길이를 초과하면 오류 발생
		

		color = "red|blue|yellow";
		st = new StringTokenizer(color,"|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
	}

}
