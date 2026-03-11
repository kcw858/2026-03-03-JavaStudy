import java.util.*;
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// 난수 이용 => 1~100 사이의 수를 임의로 추출 후 맞추기 UP/DOWN
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		//컴퓨터에서 난수 발생
		int com = r.nextInt(100) + 1; //1~100
		
		do
		{
			
			System.out.print("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			
			//사용자가 잘못입력했을 경우
			if(user < 1 || user >100)
			{
				System.out.println("잘못된 입력입니다.");
				continue; //처음으로 이동
			}
			
			if(com > user)
				System.out.println("입력값보다 큰 정수 입력");
			else if(com < user)
				System.out.println("입력값보다 작은 정수 입력");
			else
			{
				System.out.println("Game Over!!");
				break;
			}
			//break,continue 밑에 코딩하면 오류발생
		}while(true);
	}

}
