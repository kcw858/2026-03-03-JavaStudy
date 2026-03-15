import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// 3개의 숫자를 난수
		// 사용자가 3개 입력
		// 자릿수 + 숫자가 맞으면 스트라이크 S
		// 숫자만 있으면 볼 B
		
		//난수발생 -> 사용자 입력 -> 비교 -> 힌트 -> 정답여부 확인 -> 종료
		//         ------------------------------------------
		//						반 복 문
		
		
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];  //컴퓨터 랜덤
		int[] user = new int[3]; //사용자 입력
		
		//난수발생 초기화
		for(int i = 0 ; i < 3 ; i++)
		{
			com[i]=(int)(Math.random()*9)+ 1; //1~9
			//중복제거
			for(int j = 0 ; j < i; j++)
			{
				//j는 저장된값, i는 현재 난수 값
				if(com[j] == com[i])
				{
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		//사용자 입력 받기
		while(true) //횟수 지정x
		{
			System.out.print("3자리 정수를 입력하세요>> ");
			int input = scan.nextInt();
			
			//잘못된 입력 확인
			if(input < 100 || input >999)
			{
				System.out.println("😣잘못된 입력입니다!!");
				//처음으로 이동
				continue;
			}
			
			//배열에 저장
			user[0] = input/100;
			user[1] = (input%100/10);
			user[2] = input % 10;
			
			//잘못된 입력 (같은 수,0 입력 x
			if(user[0] == user[1] || user[0]==user[2] || user[1] == user[2])
			{
				System.out.println("😣 같은 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0)
			{
				System.out.println("😣 0은 사용할 수 없습니다");
				continue;
			}
			//유효성 검사 => 프로그램에 필요한 값이 입력되었는지 확인
			
			//비교 시작
			
			int s=0,b=0;
			
			for(int i = 0 ; i < 3 ; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(com[i]==user[j])//같은수가 있는지 확인
					{
						if(i == j)
							s++;
						else
							b++;
					}
				}
			}
			
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3)
			{
				System.out.println("🎉 Game Over!!");
				break;
			}
		}
	}
	

}
