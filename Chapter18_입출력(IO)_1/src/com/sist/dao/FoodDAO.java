package com.sist.dao;

import java.io.FileReader;
import java.util.*;


import com.sist.vo.FoodVO;

import lombok.Getter;
//파일, 데이터베이스 연동하는 클래스
//실제 값을 채우는 경우 -> Getter / Setter
//이미 데이터가 고정 => Getter
@Getter
public class FoodDAO {
	private static List<FoodVO> fList = new ArrayList<FoodVO>();
	
	static
	{
		try
		{
			FileReader fr = new FileReader("C:\\JavaDev\\food.txt");
			
			//BufferedReader -> 한줄씩 읽는다 IO
			// 글자수가 많아 StringBuffer 이용
			StringBuffer sb = new StringBuffer();
			int i = 0; //읽은 char
			while((i = fr.read()) != -1)
			{
				sb.append((char)i);
			}
			fr.close(); //원래 try-with-resource 이용이 편하다

			//맛집별로 나눠서 저장
			String[] datas = sb.toString().split("\n");
			for(String food : datas)
			{
				FoodVO f = new FoodVO();
				StringTokenizer st = new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
		}catch(Exception ex) {}
	}

	public static List<FoodVO> getfList() {
		return fList;
	}
	
}
