package com.sist.lang;
import java.text.SimpleDateFormat;
/*
 * 534p
 *  Date => 현재 날짜를 읽어온다 -> 제어 (Calendar)
 */
import java.util.*;
public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		// => 오라클
		
		/*
		 *  년도 => yy / yyyy
		 *  월 => MM / M 
		 *  일 => dd / d
		 *  
		 *  
		 *  시간 => hh / h
		 *  분 => mm / m
		 *  초 => ss / s
		 */
	}

}
