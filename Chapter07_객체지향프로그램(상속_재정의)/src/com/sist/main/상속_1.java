package com.sist.main;

import javax.swing.JFrame;

/*
 *  1. 상속
 *   => 기능을 그냥 사용하는 것이다
 *   	------------
 *   	=> 마음에 안들 경우 변경 할 수 있다.(오버라이딩)
 *  2. 목적
 *   1) 코드 줄이기 => ctrl+v 줄이기
 *   2) 상속받기 => extends
 *   3) 상속을 받으면 => 코드를 따라 할 필요가 없다
 *   	=> 내부적으로 메모리에 저장
 *   	=> 코드가 이미 상속받은 클래스에 내장
 *  3. 오해하는 부분
 *   - 상속하면 코드를 복사하는 것이다 (x)
 *     상속내린 클래스와 연결이 되는 부분
 *     	= super : 상위클래스
 *     	= this : 자신 클래스
 *     => 상속 내링 클래스를 변경하면 상속받은 클래스에 영향
 *  4. 상속 => 재사용 + 기능 추가
 *     상속은 메모리에 저장하고 사용이 가능 => 고쳐서 사용이 가능
 *     		-> **오버라이딩
 *  
 *  => 재사용
 *  	- 상속 (is-a)  => 위로 올라갈 수록 이다 관계 성립
 *  	- 포함 (has-a) => 가지고 있다
 *  	
 *  		생물
 *  		 |
 *  	-----------
 *  	|		  |
 *     동물		 식물
 *      |		
 *   --------
 *   |		|
 *   포유류  어류 
 *   
 *   위로 올라갈수록 크다
 *   내려갈수록 구체화
 *   
 *   클래스의 크기 : 상속/포함이 있어야 잴 수있다.
 *   
 *   class A extends JFrame : 변경해서 사용
 *   
 *   class A
 *   {
 *   	JFrame jf = new JFrame(): 있는 그대로 사용
 *   }
 */
public class 상속_1 //extends JFrame
	{
	// 윈도우를 변경해서 사용한다 => 변경 (오버라이딩)
//	public 상속_1()
//	{
//		//크기
//		setSize(800,600);
//		
//		//화면을 보여주기
//		setVisible(true);
//	}
	JFrame f = new JFrame();
	public 상속_1()
	{
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 상속_1();		//생성자만 호출
		
	}

}
