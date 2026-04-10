package com.sist.commons;
// 프로토콜: 약속 => 구분자 -> 웹에서는 파일 -> 내부 프로토콜
/*
 *  => 0 ~ 65535
 *  	FTP: 22, SMTP: 25, Telnet: 23
 *  	... 8080: 프록시 .... 4000: 머드 서버
 *  	http: 80 
 */
public class Function {
	//로그인: 이미 로그인, 로그인하고 들어간 사람
	public static final int LOGIN = 100;
	public static final int MYLOG = 110;
	public static final int CHAT  = 200;
	//나간 사람과 이미 나간사람
	public static final int EXIT  = 300;
	public static final int MYEXIE= 310;
}
