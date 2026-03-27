package com.sist.exception;

//멀티 catch => 다중 예외처리
public class 예외처리_2 {

	public static void main(String[] args) {
		try
		{
			String n1 = "10";
			String n2 = "3";
			int[] arr = {
					Integer.parseInt(n1),
					Integer.parseInt(n2)
			};
			
			int res = arr[0] / arr[2];
			System.out.println(res);
			//catch 절은 else if 와 같다 
		}catch(NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException e)
		{
			e.printStackTrace();
		}
		//기본 => catch(Exception e)
			
		
		
		
//		catch(NumberFormatException ex)
//		{
//			ex.printStackTrace();
//			// NumberFormatException: 정수 변환이 안되는 경우
//		}catch(ArrayIndexOutOfBoundsException ex)
//		{
//			ex.printStackTrace();
//			//ArrayIndexOutOfBoundsException: 배열범위 초과
//		}catch(ArithmeticException ex)
//		{
//			ex.printStackTrace();
//			//ArithmeticException: 0으로 나누는 경우
//		}catch(Exception ex) //else와 같다
//		{
//			ex.printStackTrace();
//			
//		}
	}

}
