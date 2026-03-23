package com.sist.manager;
/*
 *  공통으로 적용되는 메소드, 변수
 *  ---------------------
 *  static사용시 데이터가 겹쳐져버린다
 *  => 상속
 *  	- 코딩을 줄일 수 있다.
 *  	- 필요시에 변경해서 사용이 가능
 *  
 *  => 추상클래스 / 인터페이스 사용이 더 적합
 *  
 *  286~290P 생성자 호풀
 *  	=> 상속 내리는 클래스 => 생성자 (매개변수가 있는경우)
 *  		=> 상속받는 클래스에서는 반드시 super(매개변수..)
 *   (매개변수가 없으면 생략가능)
 */
public class GenieMusicManager {
	public static Music[] musics = new Music[100];
	//static, 생성자는 상속이 안된다.
	//메소드로 만든다
	
	//크롤링 후 배열에 저장
	public void init()
	{
		
	}
	
	//목록 출력
	public Music[] musicAlldata()
	{
		return musics;
	}
	
	//상세 보기
	public Music musicDetail(int mno)
	{
		Music m = new Music();
		for(Music mm : musics)
		{
			if(mm.getMno() == mno)
			{
				m = mm;
				break;
			}
		}
		return m;
	}
	
	//검색 
	public Music[] musicFind(String type,String fd)
	{
		return musics;
	}
	
	//동영상
	public String musicKey(String title)
	{
		String key = "";
		
		return key;
	}
}
