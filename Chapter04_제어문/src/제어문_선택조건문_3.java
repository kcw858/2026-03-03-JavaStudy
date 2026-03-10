// 반복제어문: break(종료), continue(제외)

import java.util.Scanner;
public class 제어문_선택조건문_3 {

	public static void main(String[] args) {
		// 절댓값을 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력: ");
		int num = scan.nextInt();
		//검증
				System.out.println("검증: "+ Math.abs(num)); //절댓값 출력
				
		if(num < 0)
		{
			System.out.println(num * -1);
		}
		else 
		{
			System.out.println(num);
		}
//		if(num == 0)
//		{
//			System.out.println(num);
//			//return; //main종료
//		}
//		else
//		{
//			if(num < 0)
//			{
//				System.out.println(num * -1);
//			}
//			else 
//			{
//				System.out.println(num);
//			}
//		}
	}

}
