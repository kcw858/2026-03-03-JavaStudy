import java.util.Scanner;
public class 제어문_반복문_문제풀이 {

	public static void main(String[] args) {

		//1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오
		System.out.println("1) 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오");
		int sum = 0;
		for(int i = 0; i <= 100 ; i += 2)
		{
			sum += i;
		}
		System.out.println("답: "+ sum);
		
		
		
		
		
		//2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오
		System.out.println("2) 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사용자 입력 값: ");
		int n = scan.nextInt();
		sum = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
			sum += i;
		}
		System.out.println("1에서 부터 "+ n +"까지의 합: "+sum);		
		
		
		
		
		
		//3. 1부터 50까지 숫자 중 3의 배수만 출력하시오
		System.out.println("3) 1부터 50까지 숫자 중 3의 배수만 출력하시오");
		System.out.print("3의 배수 출력 : ");
		for(int i = 1 ; i <= 50 ; i++)
		{
			if(i % 3 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		
		
		
		//4. 1~100 사이에서 7의 배수 개수를 구하시오
		System.out.println("4) 1~100 사이에서 7의 배수 개수를 구하시오");
		sum = 0;
		
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i % 7 == 0)
				sum++;
		}
		System.out.println("7의 배수 갯수: " + sum);

		
		
		
		//5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
		System.out.println("5) 문자열 \"JavaProgramming\" 의 각 문자 하나씩 출력하시오");
		
		String str = "JavaProgramming";
		for(int i = 0 ; i <= str.length()-1 ; i++)
		{
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println("\n");
		
		
		
		
		//6. 1부터 10까지 숫자를 while문으로 출력하시오
		// while(조건문)
		// {
		//		반복수행문장
		// }
		System.out.println("6) 1부터 10까지 숫자를 while문으로 출력하시오");
		int a = 1;
		while(a <= 10)
		{
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println("\n");

//		do {
//			System.out.print(a + " ");
//			a++;
//		}while(a <= 10);
		
		
		//7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
		System.out.println("7) 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오");
		
		System.out.print("사용자 입력 값: ");
		n = scan.nextInt();
		
		System.out.print("1부터 " + n +"까지 출력 :");
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("\n");
		
		
		
		
		//8. 1~100 사이 홀수만 출력하시오.
		System.out.println("8) 1~100 사이 홀수만 출력하시오");
		System.out.print("1~100사이 홀수 출력 :");
		for(int i = 1 ; i <= 100 ; i += 2)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		
		
		
		//9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
		System.out.println("9) 1~100 사이 숫자 중 5의 배수 합을 구하시오.");
		System.out.print("1~100사이 숫자 중 5의 배수 합 :");
		
		sum = 0;
		for(int i = 0 ; i <= 100 ; i += 5)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
		System.out.println("\n");
		
		
		
		
		//10. 숫자 10부터 1까지 역순 출력하시오.
		System.out.println("10) 숫자 10부터 1까지 역순 출력하시오.");
		System.out.print("10부터 1까지 역순 출력: ");
		
		for(int i = 10 ; i > 0 ; i--)
		{
			System.out.print(i + " ");
		}
		
		
		
		//지역변수는 선언이 되면 다음에 사용시 반드시 변수값만 변경해서 사용 (재사용 가능, 블록이 끝나면 사라짐)
	}

}
