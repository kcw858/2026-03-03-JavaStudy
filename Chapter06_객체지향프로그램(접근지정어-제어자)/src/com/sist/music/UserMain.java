package com.sist.music;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenieMusicSystem gm = new GenieMusicSystem();
		while(true)
		{
			//인스턴스 메소드는 객체명.메소드명()
			int m = gm.menu();
			
			if(m == 5)
			{
				System.out.println("뮤직 시스템 종료");
				break;
			}
			else if(m == 1)
			{
				gm.musicList();
			}
			else if(m == 2)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("번호 입력: ");
				int no = scan.nextInt();
				gm.musicDetail(no);
			}
			else if(m == 3)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어 입력: ");
				String fd = scan.next();
				gm.titleFind(fd);
			}
			else if(m == 4)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어 입력: ");
				String singer = scan.next();
				gm.singerFind(singer);
			}
		}
	}

}
