package com.sist.vo;
// 사용자 정의 데이터형 => 한개의 music에 대한 정보
// 데이터를 모아서 한번에 윈도우나 브라우저에 전송할 목적
// 데이터 보호 => 필요시 사용이 가능(읽기 / 쓰기) getter / setter
// 캡슐화
// 반드시 => 데이터베이스 컬럼명과 반드시 일치
public class Music {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String poster;
	private int idcrement;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
	
}
