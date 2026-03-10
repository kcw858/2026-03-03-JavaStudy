import java.util.Scanner;
public class 제어문_선택문_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		System.out.print("가위(0), 바위(1), 보(2): ");
		
		int user = scan.nextInt();
		
		if(user >= 0 && user <= 2)
		{
			System.out.print("컴퓨터: ");
			switch(com)
			{
				case 0:
					System.out.print("가위");
					break;
				case 1:
					System.out.print("바위");
					break;
				case 2:
					System.out.print("보");
			}
			
			System.out.println(); //
			
			System.out.print("사용자: ");
			
			switch(user)
			{
				case 0:
					System.out.print("가위");
					break;
				case 1:
					System.out.print("바위");
					break;
				case 2:
					System.out.print("보");
			}
			
			System.out.println("\n=========결과==========");
			
			switch(com-user)
			{
				case 1: case -2:
					System.out.println("컴퓨터 Win!");
					break;
				case -1: case 2:
					System.out.println("사용자 Win!");
					break;
				case 0:
					System.out.println("비겼다!");
			}
		}
		else
		{
			System.out.println("Game Over!!");
		}
	}	

}
