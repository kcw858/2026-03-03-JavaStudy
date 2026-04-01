package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 1번 이상 반복 => +
public class 정규식_3 {

	public static void main(String[] args) {
		
		System.out.println("heeeeello".matches("he+llo"));
		// e가 한번이상 반복하고 있는지
		System.out.println("he".matches(".."));
		System.out.println("he".matches("h*."));
		System.out.println("he".matches("he*"));
		System.out.println("he".matches("h+e+"));

		
		///watch\\?v=[^가-힣]+
		//"/watch?v=hlULtigNNao\u0026list=RDhlULtigNNao\u0026start_radio=1\u0026pp=ygUG7YKk7YKkoAcB"
//		try 
//		{
//			Document doc = 
//					Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get();
//			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
//			Matcher m = p.matcher(doc.toString());
//			while(m.find())
//			{
//				String s = m.group();
//				s.substring(s.indexOf("=")+1,s.indexOf("\""));
//				System.out.println(s);
//			}
//		}catch(Exception ex) {}
	}

}
