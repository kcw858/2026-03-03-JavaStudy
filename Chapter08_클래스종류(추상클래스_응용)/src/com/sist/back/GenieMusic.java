package com.sist.back;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
// 사용자 정의 클래스 => 패키지가 다른 경우 import사용
/*
 *  checkException 					unCheckExcenption
 *  -컴파일시 예외처리가 있는지 확인			-예외처리를 확인하지 않는다
 *  =>IO							-실행시 에러
 *  =>URL/ NetWork / DataBase
 *  
 */
public class GenieMusic extends CommonsMusic{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		//try-catch 직접 처리
		try 
		{
			//예외처리
			//- 사전에 에러를 방지
			//- 비정상 종료를 방지하고 정상적으로 종료
			
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements poster = doc.select("table.list-wrap a.cover img");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i = 0; i <title.size() ; i++)
			{
				Music m = new Music();
				m.setMno(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				//<img src="http:.."> => attr()
				m.setPoster(poster.get(i).attr("src"));
				String temp = etc.get(i).text();
				String state = "";
				String id ="";
				if(temp.equals("유지"))
				{
					state = "유지";
					id="0";
				}
				else
				{
					state = temp.replaceAll("[^가-힣]", "");// 한글만 남기기
					id = temp.replaceAll("[^0-9]", ""); //숫자만 남기기
				}
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				
				musics[i] = m;
			}
		} catch (Exception ex) { }
	}

}
