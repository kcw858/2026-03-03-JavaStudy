/*		if(조건문)
 *  	{ 
 *  		
 *  	}
 *  	else if(조건문)
 *  	{
 *  		
 *  	}
 *  	else if(조건문)
 *  	{
 *  		
 *  	}
 *  	else
 *  	{
 *  
 *  	}
 *  
 *  
 *      //계산기
 *  	if(+)
		else if(-)
		else if(-)
		else if(-)
		else 없는 연산
		
		변수는 정수 2개와 연산자
		----------------------단순화하면 switch-case문
 *  */

import java.util.Scanner;
public class 제어문_다중조건문 {
	
	public static void main(String[] args) {
		//사칙연산하는 계산기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = scan.next();
			
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		char c = op.charAt(0); //입력된 문자의 첫글자
		// == 정수/실수/논리/문자만 사용가능
		
		if(c == '+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(c == '-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(c == '*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(c == '/')
		{
			if(num2 == 0)
			{
				System.out.printf("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
		}
		else //해당 조건이 없는 경우 (생략이 가능)
		{
			System.out.println("잘못된 연산입니다.");
		}
	}
}
