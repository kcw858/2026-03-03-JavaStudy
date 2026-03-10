/*
 * 형식)
 * 
 * 		if(조건) => 부정/논리/비교연산자  (true,false)
 * 		{
 * 			실행문장   => 조건이 true면 수행
 * 		}
 * 		조건이 false면 건너뛴다
 */
import java.util.Scanner;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		if(a != 10)
//			System.out.println("a = " + a); //if 소속
//		System.out.println("프로그램 종료!!"); //if와 관련x  무조건 수행
		
		
		//컴퓨터와 가위바위보 게임
		// 가위:0 , 바위:1, 보:2
		
		int com = (int)(Math.random()*3); // 0,1,2

		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0)바위(1)보(2): ");
		int user = scan.nextInt();
		String[] str = {"가위","바위","보"};
		System.out.print("컴퓨터: " + str[com]);
	
//		if(com == 0)
//			System.out.print("가위");
//		if(com == 1)
//			System.out.print("바위");
//		if(com == 2)
//			System.out.print("보");
		
		System.out.println();
				
		System.out.print("사용자: " + str[user]);
//		if(user == 0)
//			System.out.print("가위");
//		if(user == 1)
//			System.out.print("바위");
//		if(user == 2)
//			System.out.print("보");
		
		System.out.println("\n===== 결과 =======");
		
		//컴퓨터가 가위
//		if(com == 0 && user ==0)
//			System.out.println("비겼다");
//		if(com == 0 && user ==1)
//			System.out.println("사용자 Win!!");
//		if(com == 0 && user ==2)
//			System.out.println("컴퓨터 Win!!");
//		
//		//컴퓨터가 바위
//		if(com == 1 && user ==0)
//			System.out.println("컴퓨터 Win!!");
//		if(com == 1 && user ==1)
//			System.out.println("비겼다");
//		if(com == 1 && user ==2)
//			System.out.println("사용자 Win!!");
//		
//		//컴퓨터가 보
//		if(com == 2 && user ==0)
//			System.out.println("사용자 Win!!");
//		if(com == 2 && user ==1)
//			System.out.println("컴퓨터 Win!!");
//		if(com == 2 && user ==2)
//			System.out.println("비겼다");
		
		
		/*컴퓨터    사용자
			0      0          비김	0	
				   1		  사용자	-1
				   2		  컴퓨터	-2
			1	   0		  컴퓨터	1
				   1          비김	0
				   2          사용자	-1
			2	   0          사용자	2
				   1          컴퓨터	-1
				   2          비김	0
		*/
		
		int res = com-user;
		if( res == -1 || res == 2)
		{
			System.out.println("사용자 Win!!");
		}
		if( res == 1 || res == -2)
		{
			System.out.println("컴퓨터 Win!!");
		}
		if( res == 0)
		{
			System.out.println("비겼다");
		}
	}

}
