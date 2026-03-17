import java.util.Arrays;
import java.util.Scanner;

public class 숫자야구게임_메소드 {
	
	//컴퓨터 랜덤 3자리
	static int[] getRand()
	{
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
		return com;
	}
	
	//사용자 입력
	static int[] userInput()
	{
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
			
			break; //정상입력시 종료
		}
		
		return user;
	}
	
	//비교
	static void compare(int[] com,int[] user)
	{
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
		hint(s,b,user);
		if(isEnd(s))
		{
			System.out.println("Game Over!!");
			System.exit(0);
		}
	}
	
	//힌트
	static void hint(int s,int b,int[] user)
	{
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
	}
	
	static boolean isEnd(int s)
	{
		if(s ==3) return true;
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com = getRand();
		//System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		
		
		while(true)
		{
			user = userInput();
			compare(com,user);
		}
	}

}
