package com.sist.commons;

import java.awt.*;
import javax.swing.*;
/*
 *  1. class 멤버변수 사용
 *  	=> 기본형
 *  	=> 클래스형
 *  	=> 배열
 *  	----------- 데이터형
 *  
 *  2. class
 *  	= 데이터형의 사용: 필요한 변수를 모아서 저장
 *  		~VO (Spring) , ~DTO (MyBatis), ~Bean (JSP) , Entity (JPA)
 *  	 캡슐화 : private + getter/setter
 *  	= 메소드만 모아서 저장하는 클래스: 액션 클래스
 *  		~DAO (DB연동) , ~Manager (크롤링/외부 데이터(파일) 읽기), ~Service (웹,윈도우 값 전송)
 *  	-----------------------------------------------------------------------------
 *  	공통으로 사용 => static 
 */
public class ImageChange {
	//이미지 축소 / 확대
	//리턴령이 클래스형
	public static Image getImage(ImageIcon icon,int w,int h)
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
