import java.util.Scanner;
public class 제어문_다중조건문_1 {

	public static void main(String[] args) {
		// 12, 1, 2 => 겨울   3, 4, 5 => 봄  6, 7, 8 => 여름  9, 10 ,11 => 가을
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		
		if(month == 3 || month == 4 || month == 5)
		{
			System.out.println(month + "월은 봄입니다.");
		}
		else if(month == 6 || month == 7 || month == 8)
		{
			System.out.println(month + "월은 여름입니다.");
		}
		else if(month == 9 || month == 10 || month == 11)
		{
			System.out.println(month + "월은 가을입니다.");
		}
		else if(month == 12 || month == 1 || month == 2)
		{
			System.out.println(month + "월은 겨울입니다.");
		}
		else
		{
			System.out.println("없는 달입니다!!");
		}
	}

}
