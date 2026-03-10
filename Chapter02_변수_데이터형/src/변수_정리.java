//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long은 주로 시간이나 날짜
//		File f = new File("C:\\JavaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java");
//		long l = f.lastModified();
//		
//		System.out.println(l);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
		

		Math.random(); //0.0 ~ 0.99
		
		//입력값
		
		//String name =  JOptionPane.showInputDialog("이름 입력:");
		//System.out.println(name);
//		int kor = (int)(Math.random()*101);
//		int eng = (int)(Math.random()*101);
//		int math = (int)(Math.random()*101);
		
		Random r = new Random();
		
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);
		
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
	}

}
