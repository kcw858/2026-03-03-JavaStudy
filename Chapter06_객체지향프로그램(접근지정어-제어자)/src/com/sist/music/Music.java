package com.sist.music;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//데이터를 모아서 관리 => 데이터형 클래스 => 캡슐화 
// MusicVO / MusicDTO / MusicEntity
// => 데이터 보호 / 한번에 모아서 전송-> 윈도우,웹으로 전송
//사용자 정의 데이터형 => 메모리 크기


//부분적으로 하여면 변수명 위에, 전체면 클래스 위
@Getter //읽기
@Setter //쓰기 
public class Music {
	private int no;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcremnent;
	private String poster;
}
