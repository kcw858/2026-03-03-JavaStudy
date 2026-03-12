import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// 컴퓨터와 가위바위보 10번 => ex) 2승 2무 6패
		int win=0,lose=0,same=0;
		String[] res = {"가위","바위","보"};
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 10 ; i++)
		{
			int com = (int)(Math.random()*3);
			System.out.print("가위(0),바위(1),보(2): ");
			int user = scan.nextInt();
			if(user < 0 || user > 2)
			{
				System.out.println("잘못된 입력입니다.");
				i--; //10게임을 하기위해 잘못 입력시 취소
				continue; //증가식으로 이동
			}
			System.out.println("컴퓨터: " + res[com]);
			System.out.println("사용자: " + res[user]);
			
			int r = com - user;
			if( r == -1 ||  r ==2)
			{
				System.out.println("승");
				win++;
			}
			else if( r == 1 ||  r ==-2)
			{
				System.out.println("패");
				lose++;
			}
			else
			{
				System.out.println("무");
				same++;
			}
		}
		System.out.printf("결과: %d승-%d무-%d패",win,same,lose);
		
//		int com = (int)(Math.random()*3);
//
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("가위(0),바위(1),보(2): ");
//		int user = scan.nextInt();
//		System.out.print("컴퓨터: " + res[com]);
//		System.out.print("\n사용자: " + user);
////		if(com == 0)
////		{
////			System.out.print("가위");
////		}
////		else if(com == 1)
////		{
////			System.out.print("바위");
////		}
////		else if(com == 2)
////		{
////			System.out.print("보");
////		}
//		
//		System.out.println("\n==========결과값=========");
//
//		int r = com - user;
//		if(r == -1 || r == 2)
//			System.out.println("User Win!!");
//		else if(r == 1 || r == -2)
//			System.out.println("Com Win!!");
//		else
//			System.out.println("비겼다!!");
	}

}
