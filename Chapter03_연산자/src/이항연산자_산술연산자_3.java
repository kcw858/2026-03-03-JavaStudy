import java.util.Scanner;
//정수입력을 받아 짝수인지 홀수인지 확인
public class 이항연산자_산술연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수입력: ");
//		int num = scan.nextInt();
//		
//		String res = (num % 2 == 0) ? "짝수" : "홀수";
//		
//		System.out.println(num + "는(은)" + res + "입니다");
//		
//		int no = 369;
//		
//		System.out.println(no / 100); 
//		System.out.println((no % 100) / 10);
//		System.out.println(no % 10);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		//4년마다
		//100년마다 제외
		//400년마다
		String result = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) 
							? "윤년입니다." : "윤년이 아닙니다.";
		
		System.out.println(result);
		
		
	}

}
