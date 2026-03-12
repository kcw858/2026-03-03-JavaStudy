import java.util.Scanner;
public class 제어문_문제풀이 {

	public static void main(String[] args) {
		
		System.out.println("1)Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scan.nextInt();
		
		if(num > 0)
			System.out.println(num +"는(은) 양수입니다.");
		else if(num < 0)
			System.out.println(num +"는(은) 음수입니다.");
		else
			System.out.println(num +"는(은) 0입니다.");
		System.out.println();
		
		
		
		
		
		System.out.println("2)한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라");
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		if(num % 3 == 0 && num != 0)
			System.out.println(num +"는(은) 3의 배수입니다");
		else
			System.out.println(num +"는(은) 3의 배수가 아닙니다");

		System.out.println();
		
		
		
		
		
		System.out.println("3)Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라");
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		if(num < 0)
			num = num * -1;
			
		//System.out.println("a="+Math.abs(num));
		System.out.println("a="+num);
		
		System.out.println();
		
		
		
		
		
		System.out.println("4)년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라");
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0)
			System.out.println(num + "년도는 윤년입니다");
		else
			System.out.println(num + "년도는 윤년이 아닙니다");
		
		System.out.println();
		
		
		
		
		
		System.out.println("5)100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,60점 이하면 F를 출력하라 (다중 if 사용)");
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		if(num > 100)
			System.out.println("잘못된 값입니다");
		else if(num >= 90)
			System.out.println("A학점입니다");
		else if(num >= 80)
			System.out.println("B학점입니다");
		else if(num >= 80)
			System.out.println("C학점입니다");
		else if(num >= 80)
			System.out.println("D학점입니다");
		else if(num >= 0)
			System.out.println("F학점입니다");
		else
			System.out.println("잘못된 값입니다");
		
		System.out.println();
		
		
		
		
		
		
		System.out.println("6)100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,60점 이하면 F를 출력하라 (switch~case 사용)");
		System.out.print("정수입력:");
		num = scan.nextInt();
		
		switch(num/10) {
			case 10 : 
			case 9 : System.out.println("A학점입니다"); break;
			case 8 : System.out.println("B학점입니다"); break;
			case 7 : System.out.println("C학점입니다"); break;
			case 6 : System.out.println("D학점입니다"); break;
			default : System.out.println("F학점입니다"); break;
		}
	
		System.out.println();
		
		
		
		
		
		
		System.out.println("7)정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 ");
		System.out.print("정수입력:");
		int num1 = scan.nextInt();
		
		System.out.print("+,-,*,/ 입력:");
		String s = scan.next();
		
		System.out.print("정수입력:");
		int num2 = scan.nextInt();
		
		switch (s) {
			case "+" -> System.out.printf("%d + %d = %d",num1,num2,num1 + num2); 
			case "-" -> System.out.printf("%d - %d = %d",num1,num2,num1 - num2); 
			case "*" -> System.out.printf("%d * %d = %d",num1,num2,num1 * num2); 
			case "/" -> 
			{
				if(num2 == 0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.printf("%d / %d = %d",num1,num2,num1 / num2);
			}
			default -> System.out.println("잘못된 값입니다");
				
		}
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("8)2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용) ");
		int sum = 0;
		for(int i = 2 ; i <= 100 ; i+=2)
		{
			sum += i;
		}
		System.out.println("2+4+6+....100의 합:" + sum);
		
		System.out.println();
		
		
		
		
		
		System.out.println("9)5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용) ");
		
		for(int i = 5 ; i <= 50 ; i+=5)
		{
			System.out.print(i + "    ");
		}
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("10)B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)");
		
		for(char c = 'B' ; c <= 'N' ; c+=2)
		{
			System.out.print(c + "    ");
		}
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("11)한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라");
		
		System.out.print("정수입력:");
		num = scan.nextInt();
		sum = 0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			sum += i;
		}
		System.out.print("1~"+num+"까지의 합:" + sum);
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("12)1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라");
		
		int k = 0;
		for(int i = 2 ; i <= 30 ; i += 2)
		{
			k++;
			if( k != 3)
				System.out.print(i + " ");
			else
			{
				System.out.println(i + " ");
				k = 0;
			}
		}
		
		System.out.println("\n");
		
		
		
		
		
		System.out.println("13)1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 ");
		
		sum = 0;
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			if(i % 2 == 0)
				sum -= i;
			else
				sum += i;
		}
		System.out.println("1-2+3...-10까지의 합: " + sum);
		
		System.out.println();
		
		
		
		
		
		System.out.println("14)1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용) ");
			
		for(int i = 1 ; i <= 10 ; i++)
		{
			if(i % 3 == 0)
				continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		
		
		
		System.out.println("15)Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라");
		
		
		while(true) 
		{
			System.out.println("2자리수정수입력(10~99) >>");
			num = scan.nextInt();
			if(num < 10 || num > 99)
				continue;
			break;
		}
		
		if(num % 11 == 0)		
			System.out.println("10의자리와 1의자리가 같습니다");
		else
			System.out.println("10의자리와 1의자리가 같지 않습니다");
		
		
		System.out.println();
		
		
		
		
		System.out.println("16)숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.");
		num = scan.nextInt();
		switch(num)
		{
			case 3,4,5 -> System.out.println("봄");
			case 6,7,8 -> System.out.println("여름");
			case 9,10,11 -> System.out.println("가을");
			case 12,1,2 -> System.out.println("겨울");
			default -> System.out.println("잘못된 입력값입니다.");
		}
		
		if(num <= 12 && num >=1)
		{
			if(num >= 3 && num <= 5)
				System.out.println("봄");
			else if(num >= 6 && num <= 8)
				System.out.println("여름");
			else if(num >= 9 && num <= 11)
				System.out.println("가을");
			else
				System.out.println("겨울");
		}
		else
		{
			System.out.println("잘못된 값입니다.");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("17답: continue");
		System.out.println();
		
		
		
		
		
		
		System.out.println("18답: i > 50");
		System.out.println();
	}

}
