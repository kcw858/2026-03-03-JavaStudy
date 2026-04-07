package com.sist.lambda;

import java.util.*;
import javax.swing.*;
//null대신 사용: Optional => map , filter
//orElse("이미지없음.jpg) / isPresent
//Optional + stream(데이터가 여러개인경우) 
public class Lambda_2 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("이름 입력: ");
		//System.out.println(input); 확인: "" / 취소: null
//		String result = Optional.ofNullable(input)
//								.filter(s -> s.length() > 3)  // if 3글자 이상
//								.map(s -> s.toUpperCase()) // 대문자로 변경
//								.orElse("입력값 없음"); // null 값이면 출력 
		
//		System.out.println(result);
		
		if(input != null) // null값 비교시 == 사용
		{
			if(input.length() > 3)
			{
				input = input.toUpperCase();
				System.out.println(input);
			}else
			{
				System.out.println(input);
			}
		}
		else
		{
			System.out.println("입력값 없음");
		}
	}

}
