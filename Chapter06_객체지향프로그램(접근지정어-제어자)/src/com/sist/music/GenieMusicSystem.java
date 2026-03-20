package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
	//공개 = 공유
	public static Music[] music = new Music[50];
	
	//초기화 => 객체생성 없이 초기화
	static	//자동으로 호출 => 상속 예외
	{
		try 
		{
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			//System.out.println(title);
			Elements etc = doc.select("table.list-wrap span.rank");
			for(int i = 0 ; i < title.size() ; i++)
			{
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				//System.out.println(etc.get(i).text());
				String temp = etc.get(i).text();
				String state="";
				String id = "";
				if(temp.equals("유지"))
				{
					state = "유지";
					id="0";
				}else
				{
					state = temp.replaceAll("[^가-힣]", ""); //한글제외
					id = temp.replaceAll("[^0-9]", ""); //숫자제외
				}
				System.out.println("상태: " + state);
				System.out.println("등폭: " + id);
				System.out.println("=====================");
			}
			
		} catch (Exception ex) {}
	}
	
	//기능 메소드
	//1.목록 출력
	//2.상세보기
	//3.검색 => 가수,곡명
	//4.동영상
}
