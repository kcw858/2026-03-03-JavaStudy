/*
 * 
 * 	형식) 
 * 		
 * 	switch(정수/문자/문자열)
 * 	{
 * 		case 값1:
 * 			처리문장
 * 			break; => 종료
 * 		case 값2:
 * 			처리문장
 * 			break; => 종료
 * 		case 값3:
 * 			처리문장
 * 			break; => 종료
 * 		default: 처리  =>else
 * 
 * 
 *  switch(정수/문자/문자열)
 * 	{
 * 		case 값1 -> 처리문장; => 자동으로 break;
 * 		case 값2 -> 처리문장;
 * 		case 값3 -> 처리문장;
 * 		default ->
 * 	}
 */

import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = scan.next();		
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
//		switch(op)
//		{
//			case "+":
//				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
//				break;
//			case "-":
//				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
//				break;
//			case "*":
//				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
//				break;
//			case "/":
//				System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
//				break;
//			default:
//				System.out.println("없는 연산자입니다.");
//		}
		
		switch(op)
		{
			case "+","더하기" -> {
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
				System.out.println("프로그램 종료"); //두 개 이상의 문제는 {} 블럭을 줘야한다
			}
			case "-" -> System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			case "*" -> System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			case "/" -> System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			default  -> System.out.println("없는 연산자입니다.");
		}
	}

}
