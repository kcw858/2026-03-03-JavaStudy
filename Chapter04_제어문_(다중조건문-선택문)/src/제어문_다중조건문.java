/*
 *  제어문 : 다중조건문
 *  
 *   1)형식
 *   	if(조건문)
 *   	{
 *   		조건이 true면 실행 후 종료
 *   		false면 다음 조건으로 이동
 *   	}
 *   	else if(조건문)
 *   	{
 *   		조건이 true면 실행 후 종료
 *   		false면 다음 조건으로 이동
 *   	}
 *   	else if(조건문)
 *   	{
 *   		조건이 true면 실행 후 종료
 *   		false면 다음 조건으로 이동
 *   	}
 *   			.
 *   			.
 *   			.
 *   	else //필요시에만 사용
 *   	{
 *   		조건이 없는경우
 *   	}
 *   
 *   2)동작
 *   	처음부터 시작 -> 해당 조건을 찾는다
 *   	해당 조건을 찾으면 문장을 실행 후 종료
 *   
 *   3)처리
 *   	경우수가 여러개인 경우
 *   
 *   ==>단순화 : switch~case문 
 */

import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// 사칙연산 처리 (+, - , *, /), 다른연산자 처리

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = scan.next();		
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		if(op.equals("+"))
		{
			System.out.printf("%d+%d = %d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d-%d = %d\n",num1,num2,num1-num2);
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d = %d\n",num1,num2,num1*num2);
		}
		else if(op.equals("/"))
		{
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d/%d = %d\n",num1,num2,num1/num2);
		}
		else
		{
			System.out.println("연산자입력이 잘못되었습니다.");
		}
	}
}
