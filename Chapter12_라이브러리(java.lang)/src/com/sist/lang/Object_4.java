package com.sist.lang;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//toString() 활용
public class Object_4 extends JFrame implements ItemListener{

	JComboBox<String> box = new JComboBox<String>();
	JLabel la = new JLabel("",JLabel.CENTER);
	
	public Object_4()
	{
		box.addItem("홍길동"); // String이 아닌 Object
		box.addItem("심청이"); 
		box.addItem("박문수"); 
		
		add("North",box);
		add("Center",la);
		setSize(300,350); // 윈도우 크기
		setVisible(true); //윈도우 보여주기
		
		box.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource() == box)
		{
			String name = box.getSelectedItem().toString();
			//Object를 문자열로 변환 => toString()
			// -> window에서 Object를 리턴
			la.setText(name);
		}
	}
	
	public static void main(String[] args) {
		new Object_4();
	}


}
