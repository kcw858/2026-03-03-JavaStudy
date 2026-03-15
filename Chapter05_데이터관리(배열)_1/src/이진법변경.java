import java.util.Scanner;
public class 이진법변경 {

	public static void main(String[] args) {
		// 16bit => 32,767
		// 10 -> 0000 0000 0000 1010

		Scanner scan = new Scanner(System.in);
		int[] binary = new int[16];
		
		//저장 순서 => 0부터 , 15부터
		int index = 15; //뒤에서부터 저장
		
		System.out.print("0~32,767까지 사이의 정수 입력: ");
		int num = scan.nextInt();
		
		//라이브러리
		System.out.println("라이브러리를 이용: " + Integer.toBinaryString(num));
		System.out.println("라이브러리를 이용: " + Integer.toOctalString(num));
		System.out.println("라이브러리를 이용: " + Integer.toHexString(num));		
		
		
		//횟수 미지정 => while문	
		while(true)
		{
			//2로 나눈 나머지값 저장
			binary[index] = num % 2;
			
			//2로 나누기 => 1,0이 나올때까지 반복
			num = num / 2;
			
			if(num == 0)
				break;
			
			index--;
		}
		
		//출력
		
		for(int i = 0 ; i < binary.length ; i++)
		{
			if(i % 4 == 0 && i !=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
		
		
	}

}
