import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface Rand
{
	public void rand(int[] com);
}

//다중상속
public class 숫자야구게임 extends JFrame implements ActionListener,Rand{
	//힌트
	JTextArea ta = new JTextArea();
	JTextField tf = new JTextField(10);
	JButton start = new JButton("시작");
	JButton end = new JButton("종료");
	
	//게임에 필요한 변수
	private int[] com = new int[3];
	private int[] user = new int[3];
	private int s,b;
	
	//화면 UI
	public 숫자야구게임()
	{
		JScrollPane js = new JScrollPane(ta);//스크롤O
		JPanel p = new JPanel();//하나로 묶어줌
		p.add(tf);
		p.add(start);
		p.add(end);
		
		ta.setEditable(false);// 편집 방지
		tf.setEnabled(false);// 입력창 비활성화 시작시 활성화
		
		add("Center",js);
		add("South",p);
		setSize(350,400);
		setVisible(true);
		
		start.addActionListener(this); // this (actionPerformed메소드가 어디있는지)
		end.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		new 숫자야구게임();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == end)
		{
			JOptionPane.showMessageDialog(this, "프로그램 종료!!!!");
			System.exit(0);
		}
		else if(e.getSource() == start)
		{
			JOptionPane.showMessageDialog(this, "야구게임을 시작합니다!!");
			//난수발생
			rand(com); // Call By Reference 객체나 배열에 주소값을 넣어 자체 처리
			
			//입력 가능하게
			tf.setEnabled(true);
			//커서 포커스
			tf.requestFocus();
			//시작버튼 사라지기
			start.setEnabled(false);
		}
		else if(e.getSource() == tf)
		{
			//입력값 읽기
			String strInput = tf.getText();
			int input = 0;
			
			try 
			{
				//문자열을 정수로 변환
				input = Integer.parseInt(strInput);
			}catch (NumberFormatException ex){
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다");
				//this -> 어느 윈도우 위에서 보여줄지 
				
				//잘못 입력시 입력값을 지우고 포커스
				tf.setText("");
				tf.requestFocus();
				return; //아래로 내려가면 안됨
			}
			
			//정상적인 입력
			if(input < 99 || input > 999)
			{
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력해야 됩니다");
				tf.setText("");
				tf.requestFocus();
			}
			
			user[0] = input/100;
			user[1] = (input%100) /10;
			user[2] = input%10;
			
			//중복된 숫자 사용 불가
			if(user[0] == user[1] || user[1]==user[2] || user[0]==user[2])
			{
				JOptionPane.showMessageDialog(this, "중복된 숫자는 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			//0을 입력하면 안된다		
			if(user[0] == 0 || user[1] == 0 || user[2] == 0)
			{
				JOptionPane.showMessageDialog(this, "0은 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//비교
			s = 0;
			b = 0;
			for(int i =0 ; i < 3; i++) //com
			{
				for(int j = 0 ; j < 3 ; j++) //user
				{
					if(com[i] == user[j]) //같은 수가 있는지
					{
						if(i == j) //같은자리
							s++;
						else
							b++;
					}
				}
			}
			
			//힌트
			
			String hit = String.format("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			ta.append(hit);
			
			//정답이면 종료
			if(s == 3)
			{
				JOptionPane.showMessageDialog(this, "Game Over!!!");
				System.exit(0);
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}
	
	@Override
	public void rand(int[] com) {
		for(int i = 0 ; i < 3 ; i++)
		{
			com[i] = (int)(Math.random()*9) + 1;
			for(int j = 0 ; j < i ; j++)
			{
				if(com[i] == com[j])
				{
					i--;
					break;
				}
			}
		}
	
	}

}
