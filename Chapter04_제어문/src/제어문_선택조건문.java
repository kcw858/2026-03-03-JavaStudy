/*
 *  선택조건문 => true일때 false일때
 *  		   가장많이 사용
 *  	if(조건문)
 *  	{ 
 *  		조건이 true
 *  	}
 *  	else
 *  	{
 *  		조건이 false
 *  	}
 *  	
 *  
 *  	else문장은 바로 위에 있는 if문장만 제어
 *  	else문장은 단독사용 불가(항상 if문을 동반)
 */
import java.util.Scanner;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		
		//숫자 2개 입력 후 최대값 최소값 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		int num3 = num1 > num2 ? num1 : num2;
		
		if(num3 == num1)
			System.out.println("최대값: " + num1);
			System.out.println("최대값: " + num2);
		if(num3 == num2)
			System.out.println("최대값: " + num3);
		
	}

}
