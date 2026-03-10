import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// 윤년구하기 (4년마다,100년마다 제외,400년마다)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.println("입력된 년도: " + year);
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			 System.out.println(year + "년도는 윤년입니다.");
		}
		else
		{
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
		
	}

}
