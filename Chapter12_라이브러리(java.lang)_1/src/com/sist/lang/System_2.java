package com.sist.lang;

public class System_2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.print("1'정수 입력: ");
			int num1 = System.in.read(); 
			// => 키 번호를 가져온다 '1'-> 49    
			//System.out.println("num= " + (num1-'0')); //'0' 은 48
			System.in.read(); //엔터 처리
			System.out.print("2'정수 입력: ");
			int num2 = System.in.read(); 
			System.in.read(); //엔터 처리
			//System.out.println(num2);
//			System.out.print("연산자 입력(+,-,*,/): ");
//			int op = System.in.read();
//			System.in.read(); //엔터 처리
//			System.out.println(op);
			
			//================================
			//System.in.read() 사용빈도가 거의 없다
			//Scanner / BufferedReader
		}catch(Exception ex) {}
	}

}
