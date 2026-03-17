// 어디까지가 한개의 기능 -> 메소드
// 소스는 변경사항이 없다
/*
 *  1. 난수 발생 -> 3개의 난수 (중복 x)
 *  2. 사용자 입력 -> 유효성 검사(3자리 입력했는지,0을 입력했는지)
 *  3. 난수와 사용자입력을 비교
 *  4. 힌트 제공
 *  5. 종료 여부
 *  
 *  
 *  boolean static isYear(int year)
 *  {
 *  	boolean bCheck = false;
 *  	if((year % 4 == 0 && year% 100 !=0) || (year%400 == 0))
 *  	{
 *  		bCheck = true;
 *  	}
 *  	return bCheck;
 *  }
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생 ==> Set을 이용하면 중복이 없다  oracle:DISTINCT
		int[] com = new int[3];
		for(int i = 0; i< com.length ; i++)
		{
			com[i] = (int)(Math.random()*9)+1; //1~9
			for(int j = 0;j < i; j++) //첫번째는 검사하지 않는다
			{
				if(com[j] == com[i]) //com[j] -> 기존에 저장된 데이터 //com[i] -> 지금 저장된 데이터
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		
//		int su = 0;
//		boolean bCheck = false;
//		for(int i = 0; i < com.length; i++)
//		{
//			bCheck = true; //중복체크  중복이면 bCheck:true, 아니면 false
//			
//			while(bCheck)
//			{
//				su = (int)(Math.random()*9)+1;
//				bCheck = false; //while문 종료
//				for(int j = 0 ; j < i ; j++)
//				{
//					if(com[j] == su)
//					{
//						bCheck = true;
//						break;
//					}
//				}
//			}
//			com[i] = su;
//		}
//		System.out.println(Arrays.toString(com));
		
		//사용자 입력
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while(true)
		{
			System.out.print("세자리정수입력");
			int input = scan.nextInt();
			
			//정상입력 확인
			if(input < 100 || input > 999)
			{
				System.err.println("세자리 정수만 입력해야됩니다");
				// 처음으로 돌아가기
				continue; // while문의 조건식으로 이동
			}
			
			//배열에 저장
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			
			//같은수 입력 X, 0포함 X
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2])
			{
				System.err.println("같은수는 사용할 수 없습니다.");
				// 처음으로 돌아가기
				continue; // while문의 조건식으로 이동
			}
			
			if(user[0] == 0 || user[1] ==0 || user[2] == 0)
			{
				System.err.println("0은 사용할 수 없습니다.");
				// 처음으로 돌아가기
				continue; // while문의 조건식으로 이동
			}
			
			//비교 시작
			int s = 0, b= 0;
			for(int i = 0 ; i < 3 ; i++) // com
			{
				for(int j = 0 ; j < 3 ; j++) //user
				{
					if(com[i] == user[j])
					{
						if(i == j)
							s++;  //같은자리
						else
							b++; //다른자리
					}
				}
			}
				
			System.out.print("S: ");
			for(int i = 0; i < s ; i++)
			{
				System.out.print("● ");
			}
			System.out.print("\nB: ");
			
			for(int i = 0; i < b ; i++)
			{
				System.out.print("○ ");
			}
			System.out.println("");
			if(s == 3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}

}
