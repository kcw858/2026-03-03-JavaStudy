import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 인터페이스_2 extends JFrame implements ActionListener{
	JButton north = new JButton("North");
	//JButton south = new JButton("South");
	JButton center = new JButton("Center");
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JTextField tf = new JTextField(); //입력창
	public 인터페이스_2()
	{
		//화면 UI
		add("North",north); //window 추가
		//add("South",south);
		add("Center",center);
		add("East",east);
		add("West",west);
		add("South",tf);
		//window 크기
		setSize(350, 400);
		setVisible(true);
		
		north.addActionListener(this);
		//south.addActionListener(this);
		center.addActionListener(this);
		east.addActionListener(this);
		west.addActionListener(this);
		tf.addActionListener(this);
		
	}
	public static void main(String[] args) {
		//생성자 호출
		new 인터페이스_2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == north)
		{
			JOptionPane.showMessageDialog(this, "North Button Click");
		}
//		else if(e.getSource() == south)
//		{
//			JOptionPane.showMessageDialog(this, "South Button Click");
//		}
		else if(e.getSource() == center)
		{
			JOptionPane.showMessageDialog(this, "Center Button Click");
		}
		else if(e.getSource() == east)
		{
			JOptionPane.showMessageDialog(this, "East Button Click");
		}
		else if(e.getSource() == west)
		{
			JOptionPane.showMessageDialog(this, "West Button Click");
		}
		else if(e.getSource() == tf)
		{
			String msg = tf.getText(); //입력된 값
			if(msg.length() < 1)
				return;
			JOptionPane.showMessageDialog(this, msg);
		}
	}

}
