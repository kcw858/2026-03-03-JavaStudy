package com.sist.lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_1 {

	public static void main(String[] args) {
		// 데이터가 짝수면 제곱을 출력
		//			  ---ㅡmap
		//		 ---filter
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream() //데이터를 다 가져온다
			.filter(n -> n%2 == 0)
			.map(n -> n*n)
			.forEach(System.out::println);
		
		for(int i:list) //stream
		{
			if(i%2 ==0) //filter
			{
				i = i*i; //map
				System.out.println(i); //forEach
			}
		}
		
		System.out.println("===== 문자열을 대문자로 변환 ====");
		//map만 이용 후 forEach출력
		
		List<String> names = Arrays.asList("king","scott","clerk");
		
		names.stream()
			//.map(String::toUpperCase) //메소드를 참조
			  .map(name -> name.toUpperCase())
			  //.forEach(name -> System.out.println(name));
			  .forEach(System.out::println);
		
		System.out.println("===== for문 이용=====");
		
		for(String name : names)
		{
			name = name.toUpperCase();
			System.out.println(name);
		}
	}
}