import java.util.Random;
import java.util.Scanner;

public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// up-down게임
		// 1~100사이 임의의 숫자를 사용자가 입력해 맞추는 게임
		// 난수 > 입력값 => UP      난수 < 입력값 => DOWN     난수 = 입력값 => 종료(System.exit(0))
		
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		
		int com = r.nextInt(100) + 1;
		
		for(;;)
		{
			System.out.print("1~100사이의 정수 입력: ");
			int user = scan.nextInt();
			
			//System.out.println("USER Input: "+user);
			if(com > user)
				System.out.println("입력값보다 큰수를 입력(UP)");
			else if(com < user)
				System.out.println("입력값보다 작은수를 입력(DOWN)");
			else
			{
				//같은 경우 종료
				System.out.println("Game Over!!");
				System.exit(0);
			}
		}		
		
	
	}

}
