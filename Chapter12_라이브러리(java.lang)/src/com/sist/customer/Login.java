package com.sist.customer;

import java.awt.*;
import javax.swing.*;


/*
 *  윈도우
 *   **= JFrame : 일반 위도우
 *   = JWindow : 끄고 닫는 버튼이 없다 ex)이클립스 실행시 뜨는 화면
 *   **= JPanel => 단독으로 사용할 수 없다
 *   = JDialog => 모달창 JFrame위에 다른 위도우
 *  컴포넌트
 *    = 버튼 종류
 *    	JButton
 *    	JCheckBox, JRadioButton
 *    	JMenu
 *    = 입력 종류
 *    	JTextField: 한줄 입력 ex)아이디, 이름 , 검색
 *    	JTextArea: 여러줄 입력
 *    	JPasswordField: 암호화
 *    = 목록 종류
 *    	JTable, JTree, JList
 *    = 기타
 *    	JLabel: 이미지 출력 / 입력내용 ...
 */
public class Login extends JFrame{
	JLabel la1,la2;
	JTextField tf; 	    //일반 문자열
	JPasswordField pf; // 비밀번호 입력
	JButton b1,b2; // b1: 로그인 버튼, b2: 취소버튼
	
	//시작과 동시에 UI
	public Login()
	{
		//레이아웃 => 화면 배치
		setLayout(null); // 사용자 정의 -> 직접 배치
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		
		// 배치
		la1.setBounds(10,15,80,30);
		tf.setBounds(95, 15, 150, 30);
		
		la2.setBounds(10,50,80,30);
		pf.setBounds(95, 50, 150, 30);
		
		add(la1); add(tf);
		add(la2); add(pf);
		
		JPanel p = new JPanel(); //Panel은 자동 가운데 배치
		p.add(b1); p.add(b2);
		p.setBounds(10, 90, 235, 35);
		add(p);
		
		setBounds(800, 400, 265, 175); //인도우 크기
		setVisible(true);
	}
}
