package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.commons.Function;

//클라이언트에서 사용하는 쓰레드는 서버값을 읽어서 출력만 해주는 역할이다
public class ClientMainForm extends JFrame implements ActionListener,Runnable{
    JTextArea ta;
    JTextField tf;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2,b3;
    LoginForm login=new LoginForm();
    //서버와 연결
    Socket s; //전화기 => 전화를 걸면 서버와 연결
    //서버 전화번호 필요
    /*
     *  서버는 클라이언트 정보(IP / PORT)를 가지고 있어야한다
     *    | OutputStream | BufferesReader
     *  클라이언트는 서버 정보(IP / PORT)를 가지고 있어야한다
     *   | BufferesReader | OutputStream
     */
    OutputStream out; //서버로 요청
    BufferedReader in; // 서버에서 응답값을 받는다
    public ClientMainForm()
    {
    	ta=new JTextArea();
    	JScrollPane js1=new JScrollPane(ta);
    	ta.setEditable(false);
    	
    	tf=new JTextField();
    	b1=new JButton("쪽지보내기");
    	b2=new JButton("정보 보기");
    	b3=new JButton("나가기");
    	
    	String[] col={"아이디","이름","성별"};
    	String[][] row=new String[0][3];
    	// 한번만 사용 (재사용은 할 수 없다)
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    	   	
    	}; // 익명의 클래스 : 윈도우 / 빅데이터 
    	table=new JTable(model);
    	JScrollPane js2=new JScrollPane(table);
    	
    	////// 배치 
    	setLayout(null);
    	js1.setBounds(10, 15, 500, 450);
    	tf.setBounds(10, 470, 500, 30);
    	
    	js2.setBounds(515, 15, 250, 300);
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(3, 1,5,5));
    	p.add(b1);p.add(b2);p.add(b3);
    	p.setBounds(515, 320, 250, 130);
    	
    	// 윈도우 추가
    	add(js1);
    	add(tf);
    	add(js2);
    	add(p);
    	
    	setSize(790, 550);
    	//setVisible(false);
    	
    	//이벤트 => 서버로 값 전송
    	login.b1.addActionListener(this); //로그인
    	login.b2.addActionListener(this); //취소
    	
    	tf.addActionListener(this);
    	login.b2.addActionListener(this); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMainForm();
	}
	
	//서버와 연결 => 로그인 처리
	public void connet(String id,String name,String sex)
	{
		try
		{
			s = new Socket("localhost",8088);
			//s = new Socket("192.168.0.43",8088);
			//s => 서버 정보
			out = s.getOutputStream(); //서버가 읽어가는 위치
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 서버가 보낸 값을 가지고 온다
			out.write((Function.LOGIN + "|" + id + "|" + name + "|" + sex + "\n").getBytes());
		}catch(Exception ex) {}
		
		//서버로부터 값을 읽어와라
		new Thread(this).start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login.b2)
		{
			dispose(); //윈도우 메모리 회수
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource() == login.b1)
		{
			//로그인 요청
			String id = login.tf1.getText();
			if(id.trim().length() < 1)
			{
				//미입력
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(name.trim().length() < 1)
			{
				//미입력
				login.tf2.requestFocus();
				return;
			}
			String sex = "";
			if(login.rb1.isSelected())
			{
				sex ="남자";
			}else
			{
				sex ="여자";
			}
			connet(id, name, sex);
		}else if(e.getSource() == tf) // 채팅요청
		{
			String msg = tf.getText();
			if(msg.trim().length() < 1)
			{
				//문자 입력이 안되었을때
				tf.requestFocus();
				return;
			}
			try
			{	//전송
				out.write((Function.CHAT +"|" + msg + "\n").getBytes());
			}catch(Exception ex) {}
			tf.setText("");
		}else if(e.getSource() == b3)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	
	@Override
	public void run() {
		
		try
		{
			while(true)
			{
				//서버로 부터 값을 읽는다 
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol)
				{
					case Function.LOGIN -> 
					{
						String[] data = {st.nextToken(),st.nextToken(),st.nextToken()};
						model.addRow(data);
					}
					case Function.MYLOG -> 
					{
						String name = st.nextToken();
						login.setVisible(false);
						setVisible(true);
						setTitle(name);
					}
					case Function.CHAT -> 
					{
						ta.append(st.nextToken()+"\n");
					}
					case Function.MYEXIE -> 
					{
						dispose();
						System.exit(0);
					}
					case Function.EXIT -> 
					{
						//남아 있는 사람은 테이블에서 삭제
						String mid = st.nextToken();
						for(int i = 0 ; i < model.getRowCount() ; i++)
						{
							String id = model.getValueAt(i, 0).toString();
							if(mid.equals(id))
							{
								model.removeRow(i);
								break;
							}
						}
					}
				}
			}
		}catch(Exception ex) {}
	}

}