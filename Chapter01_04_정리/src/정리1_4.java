/*
 * 프로그램 순서
 * 	데이터 저장 -> 데이터 가공 -> 화면출력
 * 	-------		-------    ------
 * 				연산자/제어문   System.out.println()
 * 	변수: 데이터 1개 저장			System.out.print()
 * 	배열: 같은 데이터 여러개 저장	System.out.printf()
 * 	클래스: 다른 데이터 여러개 저장
 * 		 => 사용자 정의 데이터
 * 
 *	변수 : 한개의 데이터 저장
 *		  ------------
 *	      메모리 크기 결정
 *		  ----------- 기본형 (데이터형,자료형)
 *		정수: byte(1byte), int(4byte), long(8byte)
 *			-> 컴퓨터는 모든 정수를 int로 인식
 *			-> long형은 숫자뒤 l,L 표기
 *		실수: double(8byte)
 *		논리: boolean : true/false만 저장 할 수 있다
 *		문자: char(2byte) =>각국의 언어 사용가능
 *		문자열: String => 웹/네트워크는 모든 데이터가 문자열이다.
 *
 *		변수명 설정
 *		-> 알파벳이나 한글로 시작 (알파벳은 대소문자 구분, 가급적이면 한글 사용 자제)
 *		-> 숫자 사용이 가능하지만 앞에 올 수 없다.
 *		-> 키워드는 사용 불가 ex) double, int
 *		-> 공백을 포함할 수 없다.
 *		-> 특수문자사용 불가능 (_, $만 사용가능)
 *		--------------------------------
 *		가독성 (약속)
 *		-> 클래스와 인터페이스는 대문자로 시작
 *		-> 메소드와 변수는 소문자로 시작
 *		-> 상수는 모두 대문자
 *		-> 단어가 2개이상이면 시작단어를 대문자로 표기 ex) MainClass, FileName
 *		-> 들여쓰기
 *		-----------------------------------------
 *	
 *	데이터 가공
 *		단항연산자
 *			증감연산자 : ++,--
 *			형변환연산자 : 데이터형
 *				->규칙
 *					1) 가장 큰데이터형으로 변환: int+double => double
 *					2) int이하 연산자의 결과는 int: byte,char,short => int
 *					3) 자동 형변환 : 작은 데이터형 -> 큰 데이터형으로 전송
 *					4) 강제 형변환 : 큰 데이터형 -> 작은 데이터형으로 변경
 *					byte<char<int<long<double (boolean은 제외)
 *			부정연산자 : 조건문을 만드는 경우
 *	
 *		이항연산자
 *			산술연산자 : +, -, /, *, %
 *			비교연산자 : ==, !=, <, >, <=, >=
 *			논리연산자 : && , ||
 *				&& => 두개 다 true여야 true (앞 조건이 false면 뒷 조건은 처리하지않는다)
 *				|| => 하나라도 true면 true 	(앞 조건이 true면 뒷 조건은 처리하지않는다)
 *			대입연산자 : = , += , -=
 *		
 *		삼항연산자
 *			(조건) ? 값1 : 값2
 *			-> 조건이 true면 값1, false면 값2
 *
 *		제어문
 *			조건문
 *				단일 조건문
 *					if(조건)
 *					{
 *						실행문장 => 조건이 true일때 
 *					}
 *
 *				선택 조건문
 *					if(조건)
 *					{
 *						조건 true
 *					}
 *					else
 *					{
 *						조건 false
 *					}
 *
 *				다중 조건문 : 한개의 조건만 수행
 *					if(조건1)
 *					{
 *						조건1이 true면 처리하고 종료
 *						false면 다음 조건으로 이동
 *					}
 *					else if(조건2)
 *					{
 *						
 *					}
 *						...
 *					else // 조건이 없는경우 처리(생략가능)
 *					{
 *
 *					}
 *
 *			선택문
 *				switch-case : 다중 조건문을 단순화
 *							: + break ==> -> 로 간소하게 가능
 *			반복문
 *				for : 반복횟수가 지정되면
 *					for(초기값 ; 조건식 ; 증가식)
 *						실행문장 -> 조건이 false면 종료
 *
 *				while : 반복 횟수가 없을때(DB프로그램이나 파일에 많이 사용)
 *					초기값
 *					while(조건식)
 *					{
 *						실행문장
 *						증가식
 *					}
 *
 *				do-while 
 *					초기값
 *					do{
 *						실행문장
 *						증가식
 *					}while(조건식);
 *				- 반드시 한번은 수행
 *
 *			반복제어문
 *				break : whitch-case, 반복문에서 사용 (제어문 종료)
 *				continue : 반복문 안에서만 사용 (특정부분을 제외)
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class 정리1_4 extends JFrame implements KeyListener{
	
	GameView gv = new GameView();
	
	public 정리1_4()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 정리1_4();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this)
		 {
			switch(e.getKeyCode())
			{
				case KeyEvent.VK_RIGHT:
					System.out.println(111);
					gv.x+=5;
					if(gv.x>800)
						gv.x=0;
					gv.repaint();
			}
		 }
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
