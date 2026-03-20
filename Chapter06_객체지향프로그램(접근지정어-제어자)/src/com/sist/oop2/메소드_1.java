package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  매개변수가 알 수 없는 경우 ==> 웹: 필터 => 가변매개변수
 *  => String... str 
 */
//검색 -> 필터링에서 많이 사용
//String.fomat
class Temp
{
	public void sum(int... value) //배열형식으로 가져온다
	{
		int s = 0;
		for(int i = 0; i < value.length ; i++)
		{
			s += value[i];//값은 배열형식으로 
		}
		System.out.println("sum= " +s);
	}
	//Object... 모든 데이터형 사용
	
	public String change(int num)
	{
		DecimalFormat d = new DecimalFormat("###,###,###");
		return d.format(num);
	}
	
	public String dateChange(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t = new Temp();
		t.sum(10);
		t.sum(10,20,30,40,50,60,70);
		int a = 100000000;
		String res = t.change(a);
		System.out.println(res + "원");
		res = t.dateChange(new Date());
		System.out.println(new Date());
		System.out.println(res);
	
	}

}
