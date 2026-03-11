import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
//		System.out.print("문자열 입력: ");
//		String msg = scan.nextLine();
//		System.out.println(msg);
	
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		
//		switch(month)
//		{
//			case 3: 
//			case 4:
//			case 5:
//					System.out.println(month + "월은 봄입니다.");
//					break;
//			case 6: 
//			case 7:
//			case 8:
//					System.out.println(month + "월은 여름입니다.");
//					break;
//			case 9: 
//			case 10:
//			case 11:
//					System.out.println(month + "월은 가을입니다.");
//					break;
//			case 12: 
//			case 1:
//			case 2:
//					System.out.println(month + "월은 겨울입니다.");
//					break;
//		}
		
		switch(month)
		{
			case 3,4,5 	 -> System.out.println(month + "월은 봄입니다."); 
			case 6,7,8   -> System.out.println(month + "월은 여름입니다.");
			case 9,10,11 -> System.out.println(month + "월은 가을입니다.");
			case 12,1,2  -> System.out.println(month + "월은 겨울입니다.");
			default      -> System.out.println("없는 달입니다.");
		}
	}

}
