import java.util.Scanner;
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		//사용자가 구구단의 단을 입력하면 해당 단을 출력
		//변수 => 상요자가 입력한 단
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단입력: ");
		int dan = scan.nextInt();
		
		int i = 1; //1~9까지 변경되는 변수 : 루프변수
		while(i <= 9)
		{
			System.out.printf("%d * %d = %2d\n",dan,i,dan*i);
			i++;
		}
	}

}
