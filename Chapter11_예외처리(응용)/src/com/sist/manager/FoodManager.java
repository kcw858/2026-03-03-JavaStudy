package com.sist.manager;

import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;

public class FoodManager implements Manager{
	//맛집 데이터 저장
	public static FoodVO[] foods = new FoodVO[448];
	/*
	 *  1. 데이터형
	 *  	= 기본형
	 *  		정수(int)..
	 *  	= 참조형
	 *  		클래스, 배열 => 주소를 이용한 방식
	 *  		---- 자바 라이브러리 클래스 / 사용자 정의
	 *  		클래스 1개는 하나의 맛집에 대한 정보를 가지고 있다
	 *  2. 데이터 공유
	 *  	=> 모든 사용자가 같은 데이터를 사용 => 공유
	 *  		-> static: 오라클 변수 같은 경우도 static이다 (데이터베이스 -> 공유된 데이터)
	 *  3. 모든 클래스에서 접근이 가능
	 *  	=> public
	 *  	모든 변수는 private이 아니다 => 선택적
	 *  4. 초기화 => 값을 저장
	 *  	1) 명시적 초기화: 직접 값을 지정
	 *  	2) 초기화 블록
	 *  		인스턴스: {}
	 *  		정적블록: static{}
	 *  		생성자
	 *  		=> 클래스 블록은 선언만 가능하기 때문에 초기화 필요
	 *  		**static변수 => static{}
	 *  		  인스턴스 => 생성자
	 *  		---------------------------------> 초기화 블록은 상속 예외
	 */		
	
	//초기화 => 배열 값 저장
	static 
	{
		//구현해서 초기화 가능 => 자동 호출
		// => 파일읽기 -> CheckedException -> 예외처리 필수
		// => 초기화블록은 throws를 사용할 수 없다
		try
		{
			// StringBuffer는 문자열을 모을 수 있는 임시 저장 장소를 가지고 있다
			// => 문자열 결합에 속도가 빠르다 : Buffer
			StringBuffer sb = new StringBuffer();
			
			int i = 0;
			FileReader in = new FileReader("C:\\JavaDev\\food.txt");
			while((i = in.read()) != -1)
			{
				sb.append((char)i);
				//int read() => char로 변환 
				//한글자씩 읽어 온다 ==> BufferedReader는 한줄씩 읽어온다
			}
			in.close();
			String[] datas = sb.toString().split("\n");
			i = 0;
			/*
			 * 448|
			 * 타이타닉찜닭똥집|
			 * 한식|
			 * (053) 954-2802|
			 * 대구 동구 신암1동 595-1 2층|
			 * 4.0|
			 * 5대, 주차방법: 유료, 주차장소: 전용|
			 * /restaurant/restimg/003/zzmenuimg/h70225315_z.jpg
			 * |16:00 ~ 06:00
			 * |평화시장 내 똥집거리에 위치해있는 타이타닉은 똥집과 찜닭 전문점이다. 넓은 실내와 깔끔하고 아늑한 인테리어를 자랑하는 타이타닉은 바삭하고 쫄깃한 모듬똥집이 푸짐하게 준비된다. 맥주없이는 먹을 수 없는 똥집은 한번 맛보면 잊혀질 수 없는 맛이다. 술안주로 똥집이 있다면 밥도둑으로는 타타찜닭이 있다. 타이타닉만의 특제 소스를 가미한 타타찜닭은 자신도 모르게 밥 한 공기 뚝딱 비워낼정도로 중독성 강한 맛을 자랑한다. 회식장소로도 일품인 타이타닉을 추천한다.
			 * |술 마시는 친구와 함께 , 일상데이트 , 닭볶음탕 , 맥주 , 소주 , 국물요리 , 대구 팔공산 벚꽃축제
			 * |10,000 ~ 20,000원
			 */
			for(String data : datas)
			{
				String[] s = data.split("\\|");
				FoodVO vo = new FoodVO();
				vo.setMno(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setPoster(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i] = vo;
				i++;
				
			}
			//System.out.println(sb.toString());
		}catch(Exception ex){}
	}
	@Override
	public FoodVO[] food_list(int page) {
		int j = 0;
		/*
		 *  0   pagecnt 1페이지 시작위치
		 *  1
		 *  2
		 *  3
		 *  4
		 *  5
		 *  6
		 *  7
		 *  8
		 *  9
		 *  10  pagecnt 2페이지 시작위치
		 *  11
		 *  12
		 *  13
		 *  .....
		 */
		int pagecnt = (page *10) -10; // 페이지별 배열의 시작점 [ 1페이지는 0번부터 2페이지는 10번부터 ]
		int row = 10;
		int total = food_total();
		if(total == page)
			row = foods.length % 10; // 마지막 페이지가 10개가 아닐 수 있다
		
		FoodVO[] food = new FoodVO[row];
		
		// ArrayList -> 배열의 단점을 보완 => 크기를 지정하지 않는다
		for(int i = 0 ; i < foods.length; i++)
		{
			//i>= pagecnt 배열의 시작점 
			if(j < 10 && i>= pagecnt) //시작페이지 10개씩
			{
				food[j] = foods[i];
				j++; //10개씩 나눠줌		 
			}
		}
		return food;
	}
	@Override
	public FoodVO food_detail(int no) {
		
		return foods[no-1];
	}
	@Override
	public FoodVO[] food_find(String type, String fd) {
		
		return null;
	}
	@Override
	public FoodVO[] food_filter(String type) {
		int row = 0;
		for(FoodVO vo : foods)
		{
			if(vo.getType().contains(type))
			{
				row++;
			}
		}
		FoodVO[] food = new FoodVO[row];
		int i = 0;
		for(FoodVO vo : foods)
		{
			if(vo.getType().contains(type))
			{
				food[i] = vo;
				i++;
			}
		}
		return food;
	}
	@Override
	public int food_total() {
		//0초과는 올림처리
		return (int)Math.ceil(foods.length/10.0);
	}
	
	//기능 
}
